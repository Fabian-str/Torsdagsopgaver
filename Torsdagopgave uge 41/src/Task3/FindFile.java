package Task3;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class FindFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner input;
        String path = "src/Task3/";
        while (true) {
            System.out.println("Indtast filnavn: ");
            String filnavn = scanner.nextLine();
            try {
                File file = new File(path + filnavn);
                input = new Scanner(file);
                while (input.hasNextLine()) {
                    System.out.println(input.nextLine());
                }
            }
            catch (FileNotFoundException e) {
                System.out.println("filen blev ikke fundet.");
                continue;
            }
            break;
        }
    }
}
