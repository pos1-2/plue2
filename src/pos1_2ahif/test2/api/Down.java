package pos1_2ahif.test2.api;

/**
* Created by Florian on 13.12.2014.
*/
public final class Down extends Direction {
    @Override
    public Direction getOppositeDirection() {
        return new Up();
    }
}
