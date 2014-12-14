package pos1_2ahif.plue2.impl;

import pos1_2ahif.plue2.api.*;

import java.io.File;
import java.util.*;

/**
 * Created by Florian on 08.12.2014.
 */
public final class BFSLabyrinth implements Labyrinth {

    // see here, how your interface is used:
    @Override
    public List<Direction> explore(Exercises e, float carryCapacity, File report) {
        if (!e.hasAnyTreasure(this)) {
            printSavingMessage(report);
            e.printReportForTreasureHunt(this, Collections.<Direction>emptyList(), report);
            return Collections.emptyList();
        }

        List<Treasure> treasuresOrderedByValue = e.getTreasuresOrderedByValue(this);
        List<Treasure> treasuresOrderedByValuePerWeight = e.getTreasuresOrderedByValuePerWeight(this);

        List<Coords> pathCoordsForValue = new LinkedList<Coords>();
        List<Coords> pathCoordsForValuePerWeight = new LinkedList<Coords>();

        float treasuresCollectedWhenPrioritizingValue =
                collectAsMuchTreasureAsPossible(
                        treasuresOrderedByValue,
                        carryCapacity,
                        pathCoordsForValue);

        float treasuresCollectedWhenPrioritizingValuePerWeight =
                collectAsMuchTreasureAsPossible(
                        treasuresOrderedByValuePerWeight,
                        carryCapacity,
                        pathCoordsForValuePerWeight);

        List<Coords> betterPathCoords;

        if (treasuresCollectedWhenPrioritizingValue > treasuresCollectedWhenPrioritizingValuePerWeight) {
            betterPathCoords = pathCoordsForValue;
        } else {
            betterPathCoords = pathCoordsForValuePerWeight;
        }

        List<List<Direction>> betterPlan = planRoutes(betterPathCoords);

        List<Direction> path = e.joinPaths(betterPlan);

        e.clearPassagesAlongPath(this, path);

        printSavingMessage(report);
        e.printReportForTreasureHunt(this, path, report);

        return path;
    }

    private List<List<Direction>> planRoutes(List<Coords> betterCoords) {
        List<List<Direction>> plan = new LinkedList<List<Direction>>();
        Coords prev = null;
        for (Coords next : betterCoords) {
            if (prev != null) {
                List<Direction> subPath = findPath(prev, next);
                if (subPath == null) {
                    throw new IllegalStateException("Error in planing: Coords not reachable! Ask for Prof. Hassanen to help you!");
                }
                plan.add(subPath);
            }
            if (!next.equals(new Coords(0, 0))) {
                collectTreasure(next);
            }
            prev = next;
        }
        return plan;
    }

    private void collectTreasure(Coords treasureCoords) {
        final Tile tile = get(treasureCoords);
        if (!(tile instanceof Treasure)) {
            throw new IllegalStateException("Cannot collect Treasure: It is not there anymore! Ask for Prof. Hassanen to help you!");
        }

        final Treasure treasure = (Treasure) tile;
        map.put(treasureCoords, new TileWithCollectedTreasure() {
            @Override
            public boolean isDirectionOpen(Direction direction) {
                return tile.isDirectionOpen(direction);
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
    }

    // -- no need to read further, not relevant for exercise!
    private void printSavingMessage(File file) {
        System.out.println("Saving " + file.getAbsolutePath() + "...");
    }

    private float collectAsMuchTreasureAsPossible(List<Treasure> treasures, float carryCapacity, List<Coords> pathCoords) {
        float weight = 0f;
        float value = 0f;

        Coords current = new Coords(0, 0);
        pathCoords.add(current);

        if (!containsKey(current)) {
            throw new IllegalStateException("Error in labyrinth! No valid start! Ask for Prof. Hassanen to help you!");
        }

        Set<Coords> alreadyCollected = new HashSet<Coords>();

        for (final Treasure treasure : treasures) {
            Coords treasurePosition = getCoordsForTreasure(treasure);
            if (treasurePosition == null) {
                throw new IllegalArgumentException("Given Treasure (value = " + treasure.getValue() + ", weight = " + treasure.getWeight() + " does not exist in labyrinth!");
            }

            if (weight + treasure.getWeight() > carryCapacity) {
                continue; // too heavy, skip it
            }

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

            alreadyCollected.add(treasurePosition);
            pathCoords.add(treasurePosition);
            weight += treasure.getWeight();
            value += treasure.getValue();
            current = treasurePosition;
        }

        // get out again
        List<Direction> pathOut = findPath(current, new Coords(0, 0));
        if (pathOut == null) {
            throw new IllegalStateException("Error in labyrinth! Expedition is trapped! Ask for Prof. Hassanen to help you!");
        }
        pathCoords.add(new Coords(0, 0));

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

                if (!get(currentCoords).isDirectionOpen(direction)) {
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

    @Override
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

        if (oldBaseTile.isDirectionOpen(baseDir) && !baseTile.isDirectionOpen(baseDir)) {
            throw new IllegalArgumentException("You can only open up passages! Not close them!");
        }

        if (!(
                (!baseTile.isDirectionOpen(baseDir) && otherTile == null)
                        || baseTile.isDirectionOpen(baseDir) == otherTile.isDirectionOpen(neighborDir))) {
            throw new IllegalArgumentException("Tiles do not match at " + base + " and " + neighbor + "! Did you check to open up the passage from both directions?");
        }
    }

    private Map<Coords, Tile> map = new HashMap<Coords, Tile>();
    private Map<Coords, Tile> unmodifiableMap = Collections.unmodifiableMap(map);
    private Map<Treasure, Coords> treasureMap = new HashMap<Treasure, Coords>();

    public Coords getCoordsForTreasure(Treasure t) {
        for (Map.Entry<Treasure, Coords> e : treasureMap.entrySet()) {
            if (e.getKey() == t || (e.getKey().getValue() == t.getValue() && e.getKey().getWeight() == t.getWeight())) {
                return e.getValue();
            }
        }
        return null;
    }

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
        } else if (tile.isDirectionOpen(direction)) {
            return ' ';
        } else if (direction instanceof Left || direction instanceof Right) {
            return '|';
        } else {
            return '-';
        }
    }

    private static char getEdgePieceForTileAndPath(Tile tile, Coords coords, Direction direction, Set<UnorderedPair> moves) {
        if (moves.contains(new UnorderedPair(coords, coords.go(direction)))) {
            if (direction instanceof Left || direction instanceof Right) {
                return '.';
            } else {
                return ':';
            }
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

    private static String getMidPiecesForTileAndPath(Tile tile, Coords coords, Set<UnorderedPair> moves) {
        char leftPiece = getMidPieceForTile(tile, coords);
        char rightPiece = getMidPieceForTile(tile, coords);

        if (moves.contains(new UnorderedPair(coords, coords.go(RIGHT)))) {
            rightPiece = '.';
        }

        if (moves.contains(new UnorderedPair(coords, coords.go(UP)))) {
            leftPiece = ':';
        } else if (moves.contains(new UnorderedPair(coords, coords.go(LEFT))) ||
                moves.contains(new UnorderedPair(coords, coords.go(DOWN)))) {
            leftPiece = '.';
        }

        return "" + leftPiece + rightPiece;
    }

    @Override
    public String toString(List<Direction> path) {
        if (isEmpty()) {
            return "";
        }

        if (path == null) {
            path = Collections.emptyList();
        }

        String newLine = System.getProperty("line.separator");

        Set<UnorderedPair> moves = new HashSet<UnorderedPair>();

        if (path != null) {
            Coords current = new Coords(0, 0);

            for (Direction direction : path) {
                Coords next = current.go(direction);
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
                // every field is 4x3 characters, e.g.
                // +--+
                // |  |
                // +--+
                // each field is responsible for drowing rows 2 & 3 and cols 2-4
                // the first row and first col in addition will draw its 1st row and col
                // if a tile is null, it will be rendered as XXX...
                // but then the 4th column and 3rd row must be rendered by the next tile to the right and down
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
                    s.append(getEdgePieceForTileAndPath(tile, coords, UP, Collections.<UnorderedPair>emptySet()));
                }
                s2.append(getMidPiecesForTileAndPath(tile, coords, moves));
                s3.append(getEdgePieceForTileAndPath(downTile, downCoords, downDirection, moves));
                s3.append(getEdgePieceForTileAndPath(downTile, downCoords, downDirection, Collections.<UnorderedPair>emptySet()));

                // print right column
                if (y == yMin) {
                    // print top right
                    s.append(getCornerPieceForTile(rightTile, rightCoords));
                }
                s2.append(getEdgePieceForTileAndPath(rightTile, rightCoords, rightDirection, moves));
                s3.append(getCornerPieceForTile(downRightTile, downRightCoords));
            }

            if (y == yMin) {
                s.append(newLine);
            }
            s.append(s2);
            s.append(newLine);
            s.append(s3);
            s.append(newLine);
        }

        return s.toString();
    }

    @Override
    public String toString() {
        return toString(null);
    }

    public BFSLabyrinth(Map<Coords, ? extends Tile> labyrinth) {
        for (Map.Entry<Coords, ? extends Tile> e : labyrinth.entrySet()) {
            final Tile tile = e.getValue();
            if (Treasure.class.isAssignableFrom(e.getValue().getClass())) {
                final Treasure treasure = (Treasure) e.getValue();
                map.put(e.getKey(), new TileWithTreasure() {
                    @Override
                    public boolean isDirectionOpen(Direction direction) {
                        return tile.isDirectionOpen(direction);
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
                treasureMap.put(treasure, e.getKey());
            } else {
                map.put(e.getKey(), new Tile() {
                    @Override
                    public boolean isDirectionOpen(Direction direction) {
                        return tile.isDirectionOpen(direction);
                    }
                });
            }
        }
    }
}
