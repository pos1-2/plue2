package pos1_2ahif.test2.internal;

import javax.xml.bind.DatatypeConverter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Created by Florian on 12.12.2014.
 */
public class GenerateBase64ClassLoader {
    public GenerateBase64ClassLoader() throws IOException {
        for (File f : new File("build/cl/main/pos1_2ahif/test2").listFiles()) {
            if (f.getName().startsWith("ReferenceSolution")) {
                String className = "pos1_2ahif.test2." + f.getName().replace(".class", "");
                byte[] data = Files.readAllBytes(f.toPath());

                System.out.println("this.defineClass(\"" + className + "\", DatatypeConverter.parseBase64Binary(\"" + DatatypeConverter.printBase64Binary(data) + "\"), 0, " + data.length + ", (CodeSource) null);");
            }
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        new GenerateBase64ClassLoader();
    }
}
