package pos1_2ahif.test2;

import javax.xml.bind.DatatypeConverter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.security.CodeSource;
import java.security.SecureClassLoader;
import java.util.*;

/**
 * Created by Florian on 08.12.2014.
 */
public final class Labyrinth implements Map<Labyrinth.Coords, Labyrinth.Tile> {
    public interface Exercises {
        public String getMyName();
        public String getMyExamAccountName();

        public boolean hasAnyTreasure(Labyrinth labyrinth);

        public List<Coords> getTreasuresOrderedByValue(Labyrinth labyrinth);

        public List<Coords> getTreasuresOrderedByValuePerWeight(Labyrinth labyrinth);

        public void clearPassagesAlongPath(Labyrinth labyrinth, List<Direction> path);

        public List<Direction> joinPaths(List<List<Direction>> paths);

        public void printPlanForTreasureHunt(Labyrinth labyrinth, List<Direction> path, File file);
    }

    public static final class Coords {
        private int x;
        private int y;

        public Coords(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public Coords go(Direction direction) {
            if (direction instanceof Left) {
                return new Coords(x - 1, y);
            } else if (direction instanceof Right) {
                return new Coords(x + 1, y);
            } else if (direction instanceof Up) {
                return new Coords(x, y - 1);
            } else if (direction instanceof Down) {
                return new Coords(x, y + 1);
            } else {
                throw new IllegalArgumentException("Unexpected direction to go: " + direction);
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Coords coords = (Coords) o;

            if (x != coords.x) return false;
            if (y != coords.y) return false;

            return true;
        }

        @Override
        public int hashCode() {
            int result = x;
            result = 31 * result + y;
            return result;
        }

        @Override
        public String toString() {
            return "[" + x + " / " + y + ']';
        }
    }

    public interface Passage {
        boolean isOpen();
    }

    public static abstract class Tile {
        public Passage getLeft() {
            return getDirection(new Left());
        }

        public Passage getRight() {
            return getDirection(new Right());
        }

        public Passage getUp() {
            return getDirection(new Up());
        }

        public Passage getDown() {
            return getDirection(new Down());
        }

        public Passage getDirection(Direction direction) {
            if (direction instanceof Left) {
                return getLeft();
            } else if (direction instanceof Right) {
                return getRight();
            } else if (direction instanceof Up) {
                return getUp();
            } else if (direction instanceof Down) {
                return getDown();
            } else {
                throw new IllegalArgumentException("Unexpected direction to get: " + direction);
            }
        }
    }

    public static abstract class Direction {
        private Direction() {
        }

        public abstract Direction getOppositeDirection();

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            return true;
        }

        @Override
        public int hashCode() {
            return getClass().hashCode();
        }

        @Override
        public String toString() {
            return getClass().getSimpleName();
        }
    }

    public static final class Left extends Direction {
        @Override
        public Direction getOppositeDirection() {
            return new Right();
        }
    }

    public static final class Right extends Direction {
        @Override
        public Direction getOppositeDirection() {
            return new Left();
        }
    }

    public static final class Up extends Direction {
        @Override
        public Direction getOppositeDirection() {
            return new Down();
        }
    }

    public static final class Down extends Direction {
        @Override
        public Direction getOppositeDirection() {
            return new Up();
        }
    }

    public interface Treasure {
        float getValue();

        float getWeight();
    }

    public interface CollectedTreasure extends Treasure {
    }

    // see here, how your interface is used:

    public List<Direction> explore(Exercises e, float carryCapacity, File report) {
        if (!e.hasAnyTreasure(this)) {
            return Collections.emptyList();
        }

        List<List<Direction>> pathsForValue = new LinkedList<List<Direction>>();
        List<List<Direction>> pathsForValuePerWeight = new LinkedList<List<Direction>>();

        float treasuresCollectedWhenPrioritizingValue =
                collectAsMuchTreasureAsPossible(
                        e.getTreasuresOrderedByValue(this),
                        carryCapacity,
                        pathsForValue);

        float treasuresCollectedWhenPrioritizingValuePerWeight =
                collectAsMuchTreasureAsPossible(
                        e.getTreasuresOrderedByValuePerWeight(this),
                        carryCapacity,
                        pathsForValuePerWeight);

        List<List<Direction>> betterRoute;

        if (treasuresCollectedWhenPrioritizingValue > treasuresCollectedWhenPrioritizingValuePerWeight) {
            betterRoute = pathsForValue;
        } else {
            betterRoute = pathsForValuePerWeight;
        }

        List<Direction> path = e.joinPaths(betterRoute);

        e.clearPassagesAlongPath(this, path);

        e.printPlanForTreasureHunt(this, path, report);

        return path;
    }

    // -- no need to read further, not relevant for exercise!

    private float collectAsMuchTreasureAsPossible(List<Coords> treasurePositions, float carryCapacity, List<List<Direction>> pathsTaken) {
        float weight = 0f;
        float value = 0f;

        Coords current = new Coords(0, 0);

        if (!containsKey(current)) {
            throw new IllegalStateException("Error in labyrinth! No valid start! Ask for Prof. Hassanen to help you!");
        }

        Set<Coords> alreadyCollected = new HashSet<Coords>();

        for (Coords treasurePosition : treasurePositions) {
            List<Direction> path = findPath(current, treasurePosition);
            if (path == null) { // not reachable
                continue;
            }

            if (alreadyCollected.contains(treasurePosition)) {
                throw new IllegalStateException("Cannot pick up treasure at coord " + treasurePosition + " twice!");
            }

            final Tile tile = get(treasurePosition);
            if (!(tile instanceof Treasure)) {
                throw new IllegalStateException("Tile at coord " + treasurePosition + " is not a treasure!");
            }

            final Treasure treasure = (Treasure) tile;

            if (weight + treasure.getWeight() > carryCapacity) {
                continue; // too heavy, skip it
            }

            alreadyCollected.add(treasurePosition);
            map.put(treasurePosition, new TileWithCollectedTreasure() {
                @Override
                public Passage getDirection(Direction direction) {
                    return tile.getDirection(direction);
                }

                @Override
                public float getValue() {
                    return treasure.getValue();
                }

                @Override
                public float getWeight() {
                    return treasure.getWeight();
                }
            });
            pathsTaken.add(path);
            weight += treasure.getWeight();
            value += treasure.getValue();
            current = treasurePosition;
        }

        // get out again
        List<Direction> pathOut = findPath(current, new Coords(0, 0));
        if (pathOut == null) {
            throw new IllegalStateException("Error in labyrinth! Expedition is trapped! Ask for Prof. Hassanen to help you!");
        }

        pathsTaken.add(pathOut);

        return value;
    }

    private static abstract class TileWithTreasure extends Tile implements Treasure {
    }

    private static abstract class TileWithCollectedTreasure extends Tile implements CollectedTreasure {
    }

    private static final Left LEFT = new Left();
    private static final Right RIGHT = new Right();
    private static final Up UP = new Up();
    private static final Down DOWN = new Down();
    private static final Collection<Direction> DIRECTIONS = Arrays.asList(LEFT, RIGHT, UP, DOWN);

    private class PathNode {
        private final PathNode parent;
        private final Coords coords;
        private final int cost;
        private final Direction direction;

        public PathNode(PathNode parent, Coords coords, int cost, Direction direction) {
            this.parent = parent;
            this.coords = coords;
            this.cost = cost;
            this.direction = direction;
        }

        public PathNode getParent() {
            return parent;
        }

        public Coords getCoords() {
            return coords;
        }

        public int getCost() {
            return cost;
        }

        public Direction getDirection() {
            return direction;
        }
    }

    private static final int BREAK_WALL_COST = 10;

    private List<Direction> findPath(Coords start, Coords end) {
        if (start.equals(end)) {
            return Collections.emptyList();
        }

        // will store the best path from start to given coords known so far
        Map<Coords, PathNode> bestPaths = new HashMap<Coords, PathNode>();

        // will sort all paths based on their current value, we will expand the path with minimal cost so far
        NavigableMap<Integer, List<PathNode>> sortedStack = new TreeMap<Integer, List<PathNode>>();

        // start node with no parent, 0 cost, and no direction where we came from
        PathNode startPath = new PathNode(null, start, 0, null);
        sortedStack.put(0, new LinkedList<PathNode>(Arrays.asList(startPath)));
        bestPaths.put(start, startPath);

        while (!sortedStack.isEmpty()) {
            final Map.Entry<Integer, List<PathNode>> e = sortedStack.firstEntry();

            final PathNode pathSoFar = e.getValue().remove(0);

            if (e.getValue().isEmpty()) {
                sortedStack.remove(e.getKey());
            }

            final Coords currentCoords = pathSoFar.getCoords();
            if (bestPaths.containsKey(currentCoords) && bestPaths.get(currentCoords) != pathSoFar) {
                // no need to follow this path, there is already another path that is as good or better
                continue;
            }

            tryDirections:
            for (Direction direction : DIRECTIONS) {
                final int stepCost;

                if (!get(currentCoords).getDirection(direction).isOpen()) {
                    stepCost = BREAK_WALL_COST; // not open passage, higher costs to break wall
                } else {
                    stepCost = 1;
                }

                Coords nextCoords = currentCoords.go(direction);

                if (!containsKey(nextCoords)) {
                    continue; // does not lead to a new tile, skip direction
                }

                PathNode newPath = new PathNode(pathSoFar, nextCoords, pathSoFar.getCost() + stepCost, direction);

                // this path must be better than other pathes leading to the same coord
                // and better as other paths leading to the end
                // this also prevents cycle, cause each step has cost of 1
                for (Coords upperBound : Arrays.asList(nextCoords, end)) {
                    if (bestPaths.containsKey(upperBound) && newPath.getCost() >= bestPaths.get(upperBound).getCost()) {
                        continue tryDirections; // another path is already as good or superior, disregard this path
                    }
                }

                bestPaths.put(nextCoords, newPath);

                if (nextCoords.equals(end)) {
                    // we found a path leading to the end
                    // remove all paths that cannot be better than this one
                    sortedStack.navigableKeySet().tailSet(newPath.getCost()).clear();
                    continue; // try other directions, maybe we hopped wall to find end, and there is an easy way around
                }

                if (sortedStack.containsKey(newPath.getCost())) {
                    sortedStack.get(newPath.getCost()).add(newPath);
                } else {
                    sortedStack.put(newPath.getCost(), new LinkedList<PathNode>(Arrays.asList(newPath)));
                }
            }
        }

        if (!bestPaths.containsKey(end)) {
            // no path to end found
            return null;
        }

        PathNode bestPath = bestPaths.get(end);

        LinkedList<Direction> path = new LinkedList<Direction>();
        while (bestPath.getDirection() != null) { // remember: start path had no direction coming from
            path.addLast(bestPath.getDirection());
            bestPath = bestPath.getParent();
        }

        Collections.reverse(path);
        return path;
    }

    public void clearPassages(Map<Coords, Tile> modifiedTiles) {
        for (Coords c : modifiedTiles.keySet()) {
            checkValidUpdate(c, modifiedTiles);
        }

        map.putAll(modifiedTiles);
    }

    private void checkValidUpdate(Coords c, Map<Coords, Tile> modifiedTiles) {
        for (Direction direction : DIRECTIONS) {
            checkValidUpdate(c, direction, c.go(direction), direction.getOppositeDirection(), modifiedTiles);
        }
    }

    private void checkValidUpdate(Coords base, Direction baseDir, Coords neighbor, Direction neighborDir, Map<Coords, Tile> modifiedTiles) {
        final Tile oldBaseTile = get(base);
        final Tile baseTile = modifiedTiles.get(base);
        final Tile otherTile = modifiedTiles.containsKey(neighbor) ? modifiedTiles.get(neighbor) : get(neighbor);

        if (base == null) {
            throw new IllegalArgumentException("You cannot set the tile at " + base + " to be empty!");
        }

        if (oldBaseTile == null) {
            throw new IllegalArgumentException("You cannot add a new tile at " + base + " to the labyrinth");
        }

        if (oldBaseTile.getDirection(baseDir).isOpen() && !baseTile.getDirection(baseDir).isOpen()) {
            throw new IllegalArgumentException("You can only open up passages! Not close them!");
        }

        if (!(
                (!baseTile.getDirection(baseDir).isOpen() && otherTile == null)
                        || baseTile.getDirection(baseDir).isOpen() == otherTile.getDirection(neighborDir).isOpen())) {
            throw new IllegalArgumentException("Tiles do not match at " + base + " and " + neighbor + "! Did you check to open up the passage from both directions?");
        }
    }

    private Map<Coords, Tile> map = new HashMap<Coords, Tile>();
    private Map<Coords, Tile> unmodifiableMap = Collections.unmodifiableMap(map);

    @Override
    public int size() {
        return unmodifiableMap.size();
    }

    @Override
    public boolean isEmpty() {
        return unmodifiableMap.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return unmodifiableMap.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return unmodifiableMap.containsValue(value);
    }

    @Override
    public Tile get(Object key) {
        return unmodifiableMap.get(key);
    }

    @Override
    public Tile put(Coords key, Tile value) {
        return unmodifiableMap.put(key, value);
    }

    @Override
    public Tile remove(Object key) {
        return unmodifiableMap.remove(key);
    }

    @Override
    public void putAll(Map<? extends Coords, ? extends Tile> m) {
        unmodifiableMap.putAll(m);
    }

    @Override
    public void clear() {
        unmodifiableMap.clear();
    }

    @Override
    public Set<Coords> keySet() {
        return unmodifiableMap.keySet();
    }

    @Override
    public Collection<Tile> values() {
        return unmodifiableMap.values();
    }

    @Override
    public Set<Entry<Coords, Tile>> entrySet() {
        return unmodifiableMap.entrySet();
    }

    public static class UnorderedPair extends HashSet<Coords> {
        public UnorderedPair(Coords a, Coords b) {
            add(a);
            add(b);
        }
    }

    private static char getCornerPieceForTile(Tile tile, Coords coords) {
        if (coords.getX() == 0 && coords.getY() == 0) { // start
            return 'S';
        } else if (tile == null) {
            return 'X';
        } else if (tile instanceof Treasure) {
            return '#';
        } else {
            return '+';
        }
    }

    private static char getEdgePieceForTile(Tile tile, Direction direction) {
        if (tile == null) {
            return 'X';
        } else if (tile.getDirection(direction).isOpen()) {
            return ' ';
        } else if (direction instanceof Left || direction instanceof Right) {
            return '|';
        } else {
            return '-';
        }
    }

    private static char getEdgePieceForTileAndPath(Tile tile, Coords coords, Direction direction, Set<UnorderedPair> moves) {
        if (moves.contains(new UnorderedPair(coords, coords.go(direction)))) {
            return '*';
        } else {
            return getEdgePieceForTile(tile, direction);
        }
    }

    private static char getMidPieceForTile(Tile tile, Coords coords) {
        if (coords.getX() == 0 && coords.getY() == 0) {
            return 'S';
        } else if (tile == null) {
            return 'X';
        } else if (tile instanceof Treasure) {
            return '#';
        } else {
            return ' ';
        }
    }

    private static char getMidPieceForTileAndPath(Tile tile, Coords coords, Set<Coords> visited) {
        if (visited.contains(coords)) {
            return '*';
        } else {
            return getMidPieceForTile(tile, coords);
        }
    }

    public String toString(List<Direction> path) {
        if (isEmpty()) {
            return "";
        }

        Set<Coords> visited = new HashSet<Coords>();
        Set<UnorderedPair> moves = new HashSet<UnorderedPair>();

        if (path != null) {
            Coords current = new Coords(0, 0);
            visited.add(current);

            for (Direction direction : path) {
                Coords next = current.go(direction);
                visited.add(next);
                moves.add(new UnorderedPair(current, next));
                current = next;
            }
        }

        int xMin = Integer.MAX_VALUE, xMax = Integer.MIN_VALUE, yMin = Integer.MAX_VALUE, yMax = Integer.MIN_VALUE;

        for (Coords coords : keySet()) {
            xMin = Math.min(coords.getX(), xMin);
            xMax = Math.max(coords.getX(), xMax);
            yMin = Math.min(coords.getY(), yMin);
            yMax = Math.max(coords.getY(), yMax);
        }

        StringBuilder s = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        StringBuilder s3 = new StringBuilder();
        for (int y = yMin; y <= yMax; y++) {
            s2.setLength(0);
            s3.setLength(0);

            for (int x = xMin; x <= xMax; x++) {
                // every field is 3x3 characters
                // each field is responsible for drowing rows and cols 2 & 3
                // the first row and first col in addition will draw its 1st row and col
                // if a tile is null, it will be rendered as XXX...
                // but then the 3rd column and row must be rendered by the next tile to the right and down
                // because there might be some walls to display
                // this is also necessary when there is a neighboring special tile because they are
                // displayed specially as well

                final Coords coords = new Coords(x, y);
                final Tile tile = get(coords);

                Coords downCoords = coords.go(DOWN);
                Tile downTile = get(downCoords);
                Direction downDirection = DOWN.getOppositeDirection();

                Coords rightCoords = coords.go(RIGHT);
                Tile rightTile = get(rightCoords);
                Direction rightDirection = RIGHT.getOppositeDirection();

                Coords downRightCoords = coords.go(DOWN).go(RIGHT);
                Tile downRightTile = get(downRightCoords);

                Coords tmpCoords = null;
                Tile tmpTile = null;

                // down right is complicated, because it is part of 4 tiles
                // :( -> we will store most special tile in tmp until we know

                if (downTile instanceof Treasure || downCoords.equals(new Coords(0, 0))) {
                    // down tile is special, we will might use it for down right corner
                    tmpCoords = downCoords;
                    tmpTile = downTile;
                } else if (tile != null) {
                    // no special below, and tile is not null hence we know how to render it
                    downCoords = coords;
                    downDirection = DOWN;
                    downTile = tile;
                }
                if (rightTile instanceof Treasure || rightCoords.equals(new Coords(0, 0))) {
                    // right tile is special, we will might use it for down right corner
                    tmpCoords = rightCoords;
                    tmpTile = rightTile;
                } else if (tile != null) {
                    // no special to the right, and tile is not null hence we know how to render it
                    rightCoords = coords;
                    rightDirection = RIGHT;
                    rightTile = tile;
                }
                // reset downright if its not special
                if (downRightTile instanceof Treasure || downRightCoords.equals(new Coords(0, 0))) {
                    // downright itself is special, we will render it as it is
                } else if (tmpTile != null) {
                    // we found a special tile below or to the right, we will render it
                    downRightCoords = tmpCoords;
                    downRightTile = tmpTile;
                } else if (tile != null) {
                    // we know how we render the tile directly
                    downRightCoords = coords;
                    downRightTile = tile;
                }

                if (x == xMin) {
                    // print leftest column
                    if (y == yMin) {
                        // print topest leftest corner
                        s.append(getCornerPieceForTile(tile, coords));
                    }
                    s2.append(getEdgePieceForTileAndPath(tile, coords, LEFT, moves));
                    s3.append(getCornerPieceForTile(downTile, downCoords));
                }

                // print middle column
                if (y == yMin) {
                    // print top middle
                    s.append(getEdgePieceForTileAndPath(tile, coords, UP, moves));
                }
                s2.append(getMidPieceForTileAndPath(tile, coords, visited));
                s3.append(getEdgePieceForTileAndPath(downTile, downCoords, downDirection, moves));

                // print right column
                if (y == yMin) {
                    // print top right
                    s.append(getCornerPieceForTile(rightTile, rightCoords));
                }
                s2.append(getEdgePieceForTileAndPath(rightTile, rightCoords, rightDirection, moves));
                s3.append(getCornerPieceForTile(downRightTile, downRightCoords));
            }

            if (y == yMin) {
                s.append('\n');
            }
            s.append(s2);
            s.append('\n');
            s.append(s3);
            s.append('\n');
        }

        return s.toString();
    }

    @Override
    public String toString() {
        return toString(null);
    }

    public Labyrinth(Map<Coords, ? extends Tile> labyrinth) {
        for (Map.Entry<Coords, ? extends Tile> e : labyrinth.entrySet()) {
            final Tile tile = e.getValue();
            if (e.getValue() instanceof Treasure) {
                final Treasure treasure = (Treasure) e.getValue();
                map.put(e.getKey(), new TileWithTreasure() {
                    @Override
                    public Passage getDirection(Direction direction) {
                        return tile.getDirection(direction);
                    }

                    @Override
                    public float getValue() {
                        return treasure.getValue();
                    }

                    @Override
                    public float getWeight() {
                        return treasure.getWeight();
                    }
                });
            } else {
                map.put(e.getKey(), new Tile() {
                    @Override
                    public Passage getDirection(Direction direction) {
                        return tile.getDirection(direction);
                    }
                });
            }
        }
    }
}
