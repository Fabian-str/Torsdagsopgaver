import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {

    public ArrayList<String> readData(String path) {
        ArrayList<String> data = new ArrayList<>();
        File file = new File(path);
        try (Scanner scan = new  Scanner(file)) {
            if (scan.hasNextLine()) scan.nextLine();
            while (scan.hasNextLine()) data.add(scan.nextLine());
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.getAbsolutePath());
        }
        return data;
    }
}