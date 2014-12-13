package pos1_2ahif.test2.api;

import pos1_2ahif.test2.Labyrinth;

/**
 * Created by Florian on 13.12.2014.
 */
public abstract class Tile {
    public Labyrinth.Passage getLeft() {
        return getDirection(new Left());
    }

    public Labyrinth.Passage getRight() {
        return getDirection(new Right());
    }

    public Labyrinth.Passage getUp() {
        return getDirection(new Up());
    }

    public Labyrinth.Passage getDown() {
        return getDirection(new Down());
    }

    public Labyrinth.Passage getDirection(Direction direction) {
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
