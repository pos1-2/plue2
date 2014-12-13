package pos1_2ahif.test2;

import pos1_2ahif.test2.api.Coords;
import pos1_2ahif.test2.api.Exercises;

import java.io.File;
import java.util.List;

/**
 * Created by Florian on 12.12.2014.
 */
public class Solution implements Exercises {
    private final Exercises referenceSolution;

    public Solution(Exercises referenceSolution) {
        this.referenceSolution = referenceSolution;
    }

    @Override
    public String getMyName() {
        return "Hier koennte Ihr Name stehen!";
    }

    @Override
    public String getMyExamAccountName() {
        return "Hier koennte Ihr Pruefungsaccountname stehen!";
    }

    @Override
    public boolean hasAnyTreasure(Labyrinth labyrinth) {
        return referenceSolution.hasAnyTreasure(labyrinth);
    }

    @Override
    public List<Coords> getTreasuresOrderedByValue(Labyrinth labyrinth) {
        return referenceSolution.getTreasuresOrderedByValue(labyrinth);
    }

    @Override
    public List<Coords> getTreasuresOrderedByValuePerWeight(Labyrinth labyrinth) {
        return referenceSolution.getTreasuresOrderedByValuePerWeight(labyrinth);
    }

    @Override
    public void clearPassagesAlongPath(Labyrinth labyrinth, List<Labyrinth.Direction> path) {
        referenceSolution.clearPassagesAlongPath(labyrinth, path);
    }

    @Override
    public List<Labyrinth.Direction> joinPaths(List<List<Labyrinth.Direction>> paths) {
        return referenceSolution.joinPaths(paths);
    }

    @Override
    public void printPlanForTreasureHunt(Labyrinth labyrinth, List<Labyrinth.Direction> path, File file) {
        referenceSolution.printPlanForTreasureHunt(labyrinth, path, file);
    }
}
