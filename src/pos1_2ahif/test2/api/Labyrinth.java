package pos1_2ahif.test2.api;

import pos1_2ahif.test2.api.Coords;
import pos1_2ahif.test2.api.Direction;
import pos1_2ahif.test2.api.Exercises;
import pos1_2ahif.test2.api.Tile;

import java.io.File;
import java.util.List;
import java.util.Map;

/**
 * Created by Florian on 13.12.2014.
 */
public interface Labyrinth extends Map<Coords, Tile> {
    List<Direction> explore(Exercises e, float carryCapacity, File report);

    void clearPassages(Map<Coords, Tile> modifiedTiles);

    String toString(List<Direction> path);
}
