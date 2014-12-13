package pos1_2ahif.test2.api;

/**
* Created by Florian on 13.12.2014.
*/
public abstract class Direction {
    Direction() {
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
