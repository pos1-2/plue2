package pos1_2ahif.plue2.api;

/**
* Created by Florian on 13.12.2014.
*/
public final class Up extends Direction {
    @Override
    public Direction getOppositeDirection() {
        return new Down();
    }
}
