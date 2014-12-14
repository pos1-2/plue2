package pos1_2ahif.plue2;

import pos1_2ahif.plue2.api.Direction;
import pos1_2ahif.plue2.api.Exercises;
import pos1_2ahif.plue2.api.Labyrinth;
import pos1_2ahif.plue2.api.Treasure;

import java.io.File;
import java.util.List;

/**
 * Created by Florian on 12.12.2014.
 */
public class Solution implements Exercises {

    @Override
    public String getMyName() {
        // setzen Sie Ihren Namen ein
        return "Hier koennte Ihr Name stehen!";
    }

    @Override
    public String getMyExamAccountName() {
        // setzen Sie den Namen Ihres Pruefungsaccount ein
        return "Hier koennte Ihr Pruefungsaccountname stehen!";
    }

    @Override
    public boolean hasAnyTreasure(Labyrinth labyrinth) {
        // ersetzen Sie den Aufruf der Referenz-Loesung mit Ihrer eigenen Implentierung
        // schreiben Sie Ihren Code direkt hier
        return referenceSolution.hasAnyTreasure(labyrinth);
    }

    @Override
    public List<Treasure> getTreasuresOrderedByValue(Labyrinth labyrinth) {
        // ersetzen Sie den Aufruf der Referenz-Loesung mit Ihrer eigenen Implentierung
        // schreiben Sie Ihren Code direkt hier
        return referenceSolution.getTreasuresOrderedByValue(labyrinth);
    }

    @Override
    public List<Treasure> getTreasuresOrderedByValuePerWeight(Labyrinth labyrinth) {
        // ersetzen Sie den Aufruf der Referenz-Loesung mit Ihrer eigenen Implentierung
        // schreiben Sie Ihren Code direkt hier
        return referenceSolution.getTreasuresOrderedByValuePerWeight(labyrinth);
    }

    @Override
    public List<Direction> joinPaths(List<List<Direction>> paths) {
        // ersetzen Sie den Aufruf der Referenz-Loesung mit Ihrer eigenen Implentierung
        // schreiben Sie Ihren Code direkt hier
        return referenceSolution.joinPaths(paths);
    }

    @Override
    public void clearPassagesAlongPath(Labyrinth labyrinth, List<Direction> path) {
        // ersetzen Sie den Aufruf der Referenz-Loesung mit Ihrer eigenen Implentierung
        // schreiben Sie Ihren Code direkt hier
        referenceSolution.clearPassagesAlongPath(labyrinth, path);
    }

    @Override
    public void printReportForTreasureHunt(Labyrinth labyrinth, List<Direction> path, File file) {
        // ersetzen Sie den Aufruf der Referenz-Loesung mit Ihrer eigenen Implentierung
        // schreiben Sie Ihren Code direkt hier
        referenceSolution.printReportForTreasureHunt(labyrinth, path, file);
    }

    // Ab hier sollten keine Aenderungen notwendig sein

    private final Exercises referenceSolution;

    public Solution(Exercises referenceSolution) {
        this.referenceSolution = referenceSolution;
    }

}
