package pos1_2ahif.test2.api;

/**
* Created by Florian on 13.12.2014.
*/
public final class Coords {
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
