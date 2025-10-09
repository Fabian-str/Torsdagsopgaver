package Task4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIO {

    public String laesFilIndhold(String filnavn) throws FileNotFoundException {
        File file = new File("src/Task4/" + filnavn);
        Scanner scanner = new Scanner(file);
        StringBuilder contents = new StringBuilder();

        while (scanner.hasNextLine()) {
            contents.append(scanner.nextLine()).append("\n");
        }
        scanner.close();

        return contents.toString();
    }
}