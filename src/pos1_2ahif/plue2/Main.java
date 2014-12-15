package pos1_2ahif.plue2;

import pos1_2ahif.plue2.api.Labyrinth;
import pos1_2ahif.plue2.impl.Assets;

import java.io.File;
import java.util.Map;

/**
 * Created by Florian on 12.12.2014.
 */
public final class Main {
    private Main() {
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        // hier wird Ihre Solution erstellt:
        Solution solution = new Solution(Assets.getReferenceSolution());

        float maxCarryCapacity = 8; // so viel kann Ihr Trupp max transportieren

        Map<String, Labyrinth> labyrinths = Assets.labyrinths();

        // 1. Labyrinth
        Labyrinth l1 = labyrinths.get("l5x5-no-treasure");
        System.out.println("Exploring l5x5-no-treasure...");
        l1.explore(solution, maxCarryCapacity, new File("l5x5-no-treasure.txt"));
        System.out.println();

        // 2. Labyrinth
        Labyrinth l2 = labyrinths.get("l10x10-treasure-4-8-and-3-1");
        System.out.println("Exploring l10x10-treasure-4-8-and-3-1...");
        l2.explore(solution, maxCarryCapacity, new File("l10x10-treasure-4-8-and-3-1.txt"));
        System.out.println();

        // 3. Labyrinth
        Labyrinth l3 = labyrinths.get("l35x15-treasure-14-8--3-1--13-1--2-1--1-1-and-1-7");
        System.out.println("Exploring l35x15-treasure-14-8--3-1--13-1--2-1--1-1-and-1-7...");
        l3.explore(solution, maxCarryCapacity, new File("l35x15-treasure-14-8--3-1--13-1--2-1--1-1-and-1-7.txt"));
        System.out.println();

        System.out.println("Done!");
    }
}
