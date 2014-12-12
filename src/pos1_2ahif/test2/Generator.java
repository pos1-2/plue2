package pos1_2ahif.test2;

import java.util.*;

/**
 * Created by Florian on 12.12.2014.
 */
public class Generator {
    private static final List<Labyrinth.Direction> DIRECTIONS = Arrays.asList(new Labyrinth.Left(), new Labyrinth.Right(), new Labyrinth.Up(), new Labyrinth.Down());
    private static final Random RANDOM = new Random();

    private static final float EXPLORE = 0.5f;
    private static final float BREAK_WALL = 0.1f;
    private static final float SECTION = 0.05f;

    private static Labyrinth.Direction random() {
        return DIRECTIONS.get(RANDOM.nextInt(DIRECTIONS.size()));
    }

    private Map<Labyrinth.Coords, MyTile> map;
    private int maxX = 0, minX = 0, maxY = 0, minY = 0;
    private int targetWidth, targetHeight;

    public Generator(int width, int height, float fill, Labyrinth.Treasure... treasures) {
        map = new HashMap<Labyrinth.Coords, MyTile>();

        targetWidth = width;
        targetHeight = height;

        Labyrinth.Coords start = new Labyrinth.Coords(0, 0);

        putCross(start);

        for (Labyrinth.Treasure t : treasures) {
            while (true) {
                Labyrinth.Coords tc = randomCoords(1);
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


    private static int pass2int(Labyrinth.Passage x) {
        return x.isOpen() ? 1 : 0;
    }

    private static String tile2string(MyTile t) {
        return pass2int(t.getLeft()) + ","
                + pass2int(t.getRight()) + ","
                + pass2int(t.getUp()) + ","
                + pass2int(t.getDown())
                + ((t instanceof Labyrinth.Treasure) ? ("," + ((Labyrinth.Treasure) t).getValue() + "f," + ((Labyrinth.Treasure) t).getWeight() + "f") : "");
    }

    public Labyrinth get(String name) {
        Labyrinth l = new Labyrinth(map);

        System.out.println("labs.put(\"" + name + "\", new Labyrinth(new HashMap<Coords, Tile>() {{");
        for (Map.Entry<Labyrinth.Coords, MyTile> e : map.entrySet()) {
            System.out.println("put(c(" + e.getKey().getX() + "," + e.getKey().getY() + "), t(" + tile2string(e.getValue()) + "));");
        }
        System.out.println("}}));");

        System.out.println(l.toString());
        return l;
    }

    private Labyrinth.Coords randomCoords() {
        return randomCoords(0);
    }

    private Labyrinth.Coords randomCoords(int margin) {
        int x = (targetWidth - getWidth());
        int y = (targetHeight - getHeight());
        return new Labyrinth.Coords(
                RANDOM.nextInt(getWidth() + 2 * x - 2 * margin) + minX - x + margin,
                RANDOM.nextInt(getHeight() + 2 * y - 2 * margin) + minY - y + margin);
    }

    private void generateRandomPath() {
        Labyrinth.Coords start = null;
        while (start == null) {
            if (Math.random() < SECTION) {
                Labyrinth.Coords candidate = randomCoords();
                if (!map.containsKey(candidate)) {
                    start = candidate;
                    map.put(start, new MyTile(false, false, false, false));
                    expand(start);
                }
            } else {
                start = new ArrayList<Labyrinth.Coords>(
                        map.keySet()
                ).get(RANDOM.nextInt(map.size()));
            }
        }
        Labyrinth.Direction d;
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

    private boolean shallContinue(Labyrinth.Coords coords, Labyrinth.Direction direction) {
        return canExpand(coords, direction)
                &&
                (!map.containsKey(coords.go(direction)) || Math.random() < BREAK_WALL);
    }

    private void generateRandomPath(Labyrinth.Coords cur, Labyrinth.Direction d) {
        List<Labyrinth.Direction> ds = new ArrayList<Labyrinth.Direction>(DIRECTIONS);

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

            for (Labyrinth.Direction dd : ds) {
                if (!map.get(cur).getDirection(dd).isOpen() && shallContinue(cur, dd)) {
                    d = dd;
                    continue nextStep;
                }
            }
            break;
        }
    }

    private void expand(Labyrinth.Coords coords) {
        maxX = Math.max(maxX, coords.getX());
        minX = Math.min(minX, coords.getX());
        maxY = Math.max(maxY, coords.getY());
        minY = Math.min(minY, coords.getY());
    }

    private boolean withinX(Labyrinth.Coords coords) {
        return coords.getX() <= maxX
                && minX <= coords.getX();
    }

    private boolean withinY(Labyrinth.Coords coords) {
        return coords.getY() <= maxY
                && minY <= coords.getY();
    }

    private boolean canGrowWidth() {
        return getWidth() < targetWidth;
    }

    private boolean canGrowHeight() {
        return getHeight() < targetHeight;
    }

    private boolean canExpand(Labyrinth.Coords coords, Labyrinth.Direction dir) {
        Labyrinth.Coords next = coords.go(dir);
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

    private void putCross(Labyrinth.Coords coords) {
        if (!map.containsKey(coords)) {
            map.put(coords, new MyTile(true, true, true, true));
            expand(coords);
        } else {
            for (Labyrinth.Direction d : DIRECTIONS) {
                map.get(coords).getUp().setOpen(true);
            }
        }

        for (Labyrinth.Direction d : DIRECTIONS) {
            Labyrinth.Coords c = coords.go(d);

            if (!map.containsKey(c)) {
                map.put(c, new MyTile(false, false, false, false));
                expand(c);
            }

            ((MyPassage) map.get(c).getDirection(d.getOppositeDirection())).setOpen(true);
        }
    }

    private void putCross(Labyrinth.Coords coords, final Labyrinth.Treasure treasure) {
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

    private static class MyPassage implements Labyrinth.Passage {
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

    private static class MyTile extends Labyrinth.Tile {
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

    private static abstract class MyTileWithTreasure extends MyTile implements Labyrinth.Treasure {
        public MyTileWithTreasure(boolean left, boolean right, boolean up, boolean down) {
            super(left, right, up, down);
        }
    }

    public static class SimpleTreasure implements Labyrinth.Treasure {
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

    private static Labyrinth.Treasure t(final float value, final float weight) {
        return new Labyrinth.Treasure() {
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
