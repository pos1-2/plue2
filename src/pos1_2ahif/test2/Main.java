package pos1_2ahif.test2;

import pos1_2ahif.test2.api.Exercises;
import pos1_2ahif.test2.api.Labyrinth;

import java.io.File;
import java.util.Map;

/**
 * Created by Florian on 12.12.2014.
 */
public final class Main {
    private Main() {
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        ClassLoader s = new Assets.SolutionLoader(Main.class.getClassLoader());

        Exercises referenceSolution = (Exercises) s.loadClass("pos1_2ahif.test2.ReferenceSolution").newInstance();

        Solution solution = new Solution(referenceSolution);

        for (Map.Entry<String, Labyrinth> e : Assets.labyrinths().entrySet()) {
            System.out.println("Exploring " + e.getKey() + "...");

            Labyrinth l = e.getValue();

            l.explore(solution, 5f, new File(e.getKey() + ".txt"));
        }
        System.out.println("Done!");
    }
}
