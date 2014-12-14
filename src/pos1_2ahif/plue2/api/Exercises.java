package pos1_2ahif.plue2.api;

import java.io.File;
import java.util.List;

/**
 * Created by Florian on 13.12.2014.
 */
public interface Exercises {
    // 0
    String getMyName();

    String getMyExamAccountName();

    // 1
    boolean hasAnyTreasure(Labyrinth labyrinth);

    // 2
    List<Treasure> getTreasuresOrderedByValue(Labyrinth labyrinth);

    // 3
    List<Treasure> getTreasuresOrderedByValuePerWeight(Labyrinth labyrinth);

    // 4
    List<Direction> joinPaths(List<List<Direction>> paths);

    // 5
    void clearPassagesAlongPath(Labyrinth labyrinth, List<Direction> path);

    // 6
    void printReportForTreasureHunt(Labyrinth labyrinth, List<Direction> path, File file);
}
