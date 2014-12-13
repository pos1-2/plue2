package pos1_2ahif.test2.internal;

import pos1_2ahif.test2.api.*;
import pos1_2ahif.test2.impl.BFSLabyrinth;

import java.util.*;

/**
 * Created by Florian on 12.12.2014.
 */
public class Generator {
    private static final List<Direction> DIRECTIONS = Arrays.asList(new Left(), new Right(), new Up(), new Down());
    private static final Random RANDOM = new Random();

    private static final float EXPLORE = 0.5f;
    private static final float BREAK_WALL = 0.1f;
    private static final float SECTION = 0.05f;

    private static Direction random() {
        return DIRECTIONS.get(RANDOM.nextInt(DIRECTIONS.size()));
    }

    private Map<Coords, MyTile> map;
    private int maxX = 0, minX = 0, maxY = 0, minY = 0;
    private int targetWidth, targetHeight;

    public Generator(int width, int height, float fill, Treasure... treasures) {
        map = new HashMap<Coords, MyTile>();

        targetWidth = width;
        targetHeight = height;

        Coords start = new Coords(0, 0);

        putCross(start);

        for (Treasure t : treasures) {
            while (true) {
                Coords tc = randomCoords(1);
                if (Math.min(
                        Math.abs(start.getX() - tc.getX()),
                        Math.abs(start.getY() - tc.getY())) <= 1) { // to near at start
                    continue;
                }

                putCross(tc, t);
                break;
            }
        }

        while (getFill() < fill) {
            generateRandomPath();
        }
    }


    private static int pass2int(BFSLabyrinth.Passage x) {
        return x.isOpen() ? 1 : 0;
    }

    private static String tile2string(MyTile t) {
        return pass2int(t.getLeft()) + ","
                + pass2int(t.getRight()) + ","
                + pass2int(t.getUp()) + ","
                + pass2int(t.getDown())
                + ((t instanceof Treasure) ? ("," + ((Treasure) t).getValue() + "f," + ((Treasure) t).getWeight() + "f") : "");
    }

    public Labyrinth get(String name) {
        Labyrinth l = new BFSLabyrinth(map);

        System.out.println("labs.put(\"" + name + "\", new Labyrinth(new HashMap<Coords, Tile>() {{");
        for (Map.Entry<Coords, MyTile> e : map.entrySet()) {
            System.out.println("put(c(" + e.getKey().getX() + "," + e.getKey().getY() + "), t(" + tile2string(e.getValue()) + "));");
        }
        System.out.println("}}));");

        System.out.println(l.toString());
        return l;
    }

    private Coords randomCoords() {
        return randomCoords(0);
    }

    private Coords randomCoords(int margin) {
        int x = (targetWidth - getWidth());
        int y = (targetHeight - getHeight());
        return new Coords(
                RANDOM.nextInt(getWidth() + 2 * x - 2 * margin) + minX - x + margin,
                RANDOM.nextInt(getHeight() + 2 * y - 2 * margin) + minY - y + margin);
    }

    private void generateRandomPath() {
        Coords start = null;
        while (start == null) {
            if (Math.random() < SECTION) {
                Coords candidate = randomCoords();
                if (!map.containsKey(candidate)) {
                    start = candidate;
                    map.put(start, new MyTile(false, false, false, false));
                    expand(start);
                }
            } else {
                start = new ArrayList<Coords>(
                        map.keySet()
                ).get(RANDOM.nextInt(map.size()));
            }
        }
        Direction d;
        while (true) {
            d = random();
            if (map.get(start).getDirection(d).isOpen()) {
                start = start.go(d);
            } else if (canExpand(start, d)) {
                break;
            }
            if (Math.random() > EXPLORE) {
                return;
            }
        }

        generateRandomPath(start, d);
    }

    private boolean shallContinue(Coords coords, Direction direction) {
        return canExpand(coords, direction)
                &&
                (!map.containsKey(coords.go(direction)) || Math.random() < BREAK_WALL);
    }

    private void generateRandomPath(Coords cur, Direction d) {
        List<Direction> ds = new ArrayList<Direction>(DIRECTIONS);

        nextStep:
        while (true) {
            ((MyPassage) map.get(cur).getDirection(d)).setOpen(true);
            cur = cur.go(d);

            if (!map.containsKey(cur)) {
                map.put(cur, new MyTile(false, false, false, false));
                expand(cur);
            }
            ((MyPassage) map.get(cur).getDirection(d.getOppositeDirection())).setOpen(true);

            Collections.shuffle(ds);

            for (Direction dd : ds) {
                if (!map.get(cur).getDirection(dd).isOpen() && shallContinue(cur, dd)) {
                    d = dd;
                    continue nextStep;
                }
            }
            break;
        }
    }

    private void expand(Coords coords) {
        maxX = Math.max(maxX, coords.getX());
        minX = Math.min(minX, coords.getX());
        maxY = Math.max(maxY, coords.getY());
        minY = Math.min(minY, coords.getY());
    }

    private boolean withinX(Coords coords) {
        return coords.getX() <= maxX
                && minX <= coords.getX();
    }

    private boolean withinY(Coords coords) {
        return coords.getY() <= maxY
                && minY <= coords.getY();
    }

    private boolean canGrowWidth() {
        return getWidth() < targetWidth;
    }

    private boolean canGrowHeight() {
        return getHeight() < targetHeight;
    }

    private boolean canExpand(Coords coords, Direction dir) {
        Coords next = coords.go(dir);
        return withinX(coords) && withinY(coords)
                && (withinX(next) || canGrowWidth())
                && (withinY(next) || canGrowHeight());
    }

    private int getWidth() {
        return maxX - minX + 1;
    }

    private int getHeight() {
        return maxY - minY + 1;
    }

    private float getFill() {
        return (float) map.size() / (float) (targetWidth * targetHeight);
    }

    private void putCross(Coords coords) {
        if (!map.containsKey(coords)) {
            map.put(coords, new MyTile(true, true, true, true));
            expand(coords);
        } else {
            for (Direction d : DIRECTIONS) {
                map.get(coords).getUp().setOpen(true);
            }
        }

        for (Direction d : DIRECTIONS) {
            Coords c = coords.go(d);

            if (!map.containsKey(c)) {
                map.put(c, new MyTile(false, false, false, false));
                expand(c);
            }

            ((MyPassage) map.get(c).getDirection(d.getOppositeDirection())).setOpen(true);
        }
    }

    private void putCross(Coords coords, final Treasure treasure) {
        map.put(coords, new MyTileWithTreasure(true, true, true, true) {
            @Override
            public float getValue() {
                return treasure.getValue();
            }

            @Override
            public float getWeight() {
                return treasure.getWeight();
            }
        });
        expand(coords);
        putCross(coords);
    }

    private static class MyPassage implements BFSLabyrinth.Passage {
        boolean open;

        public MyPassage(boolean open) {
            this.open = open;
        }

        @Override
        public boolean isOpen() {
            return open;
        }

        public void setOpen(boolean open) {
            this.open = open;
        }
    }

    private static class MyTile extends Tile {
        MyPassage left, right, up, down;

        public MyTile(boolean left, boolean right, boolean up, boolean down) {
            this.left = new MyPassage(left);
            this.right = new MyPassage(right);
            this.up = new MyPassage(up);
            this.down = new MyPassage(down);
        }

        @Override
        public MyPassage getLeft() {
            return left;
        }

        @Override
        public MyPassage getRight() {
            return right;
        }

        @Override
        public MyPassage getUp() {
            return up;
        }

        @Override
        public MyPassage getDown() {
            return down;
        }
    }

    private static abstract class MyTileWithTreasure extends MyTile implements Treasure {
        public MyTileWithTreasure(boolean left, boolean right, boolean up, boolean down) {
            super(left, right, up, down);
        }
    }

    public static class SimpleTreasure implements Treasure {
        private final float value, weight;

        public SimpleTreasure(float value, float weight) {
            this.value = value;
            this.weight = weight;
        }

        @Override
        public float getValue() {
            return value;
        }

        @Override
        public float getWeight() {
            return weight;
        }
    }

    private static Treasure t(final float value, final float weight) {
        return new Treasure() {
            @Override
            public float getValue() {
                return value;
            }

            @Override
            public float getWeight() {
                return weight;
            }
        };
    }

    public static void main(String[] args) {
        Generator g = new Generator(35, 15, 0.8f, t(4, 8), t(3, 1), t(13, 1), t(2, 1), t(1, 1), t(1, 7));
        g.get("l35x15-treasure-4-8--3-1--13-1--2-1--1-1-and-1-7");
    }
}
