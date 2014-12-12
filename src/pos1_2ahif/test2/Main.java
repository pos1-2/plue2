package pos1_2ahif.test2;

import java.io.File;

/**
 * Created by Florian on 12.12.2014.
 */
public final class Main {
    private Main() {
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Labyrinth l = new Generator(40, 12, 0.8f, new Generator.SimpleTreasure(12, 12)).get();

        ClassLoader s = new Assets.SolutionLoader(Labyrinth.class.getClassLoader());

        Labyrinth.Exercises referenceSolution = (Labyrinth.Exercises) s.loadClass("pos1_2ahif.test2.ReferenceSolution").newInstance();

        Solution solution = new Solution(referenceSolution);

        l.explore(solution, 1000, new File("report.txt"));
    }
}
