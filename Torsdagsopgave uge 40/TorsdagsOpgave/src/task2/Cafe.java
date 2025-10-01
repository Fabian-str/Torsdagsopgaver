package task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

    private ArrayList<String> coffeeMenu = new ArrayList<>();

    public void getCoffeeMenu() {
        for (String s : coffeeMenu) {
            System.out.println(s);
        }
    }

    public void loadMenuData() {

        try {
            File file = new File("coffees.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                coffeeMenu.add(scanner.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found. Check path and filename.");
        }
    }
}
