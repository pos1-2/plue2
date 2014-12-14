package pos1_2ahif.plue2.api;

/**
 * Created by Florian on 13.12.2014.
 */
public abstract class Tile {
    public boolean isLeftOpen() {
        return isDirectionOpen(new Left());
    }

    public boolean isRightOpen() {
        return isDirectionOpen(new Right());
    }

    public boolean isUpOpen() {
        return isDirectionOpen(new Up());
    }

    public boolean isDownOpen() {
        return isDirectionOpen(new Down());
    }

    public boolean isDirectionOpen(Direction direction) {
        if (direction instanceof Left) {
            return isLeftOpen();
        } else if (direction instanceof Right) {
            return isRightOpen();
        } else if (direction instanceof Up) {
            return isUpOpen();
        } else if (direction instanceof Down) {
            return isDownOpen();
        } else {
            throw new IllegalArgumentException("Unexpected direction to get: " + direction);
        }
    }
}
