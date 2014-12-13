package pos1_2ahif.test2.api;

import pos1_2ahif.test2.Labyrinth;

import java.io.File;
import java.util.List;

/**
* Created by Florian on 13.12.2014.
*/
public interface Exercises {
    public String getMyName();

    public String getMyExamAccountName();

    public boolean hasAnyTreasure(Labyrinth labyrinth);

    public List<Labyrinth.Coords> getTreasuresOrderedByValue(Labyrinth labyrinth);

    public List<Labyrinth.Coords> getTreasuresOrderedByValuePerWeight(Labyrinth labyrinth);

    public void clearPassagesAlongPath(Labyrinth labyrinth, List<Labyrinth.Direction> path);

    public List<Labyrinth.Direction> joinPaths(List<List<Labyrinth.Direction>> paths);

    public void printPlanForTreasureHunt(Labyrinth labyrinth, List<Labyrinth.Direction> path, File file);
}
