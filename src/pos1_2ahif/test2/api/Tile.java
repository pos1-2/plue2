package pos1_2ahif.test2.api;

import pos1_2ahif.test2.impl.BFSLabyrinth;

/**
 * Created by Florian on 13.12.2014.
 */
public abstract class Tile {
    public BFSLabyrinth.Passage getLeft() {
        return getDirection(new Left());
    }

    public BFSLabyrinth.Passage getRight() {
        return getDirection(new Right());
    }

    public BFSLabyrinth.Passage getUp() {
        return getDirection(new Up());
    }

    public BFSLabyrinth.Passage getDown() {
        return getDirection(new Down());
    }

    public BFSLabyrinth.Passage getDirection(Direction direction) {
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
