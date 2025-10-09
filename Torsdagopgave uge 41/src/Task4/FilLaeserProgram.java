package Task4;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilLaeserProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileIO fileIO = new FileIO();
        String contents = null;

        while (true) {
            System.out.print("Indtast filnavn: ");
            String fileName = scanner.nextLine();
            try {
                contents = fileIO.laesFilIndhold(fileName);
                break;
            }
            catch (FileNotFoundException e) {
                System.out.println("Filen blev ikke fundet. Prøv igen: ");
            }
        }
        System.out.println("\nFilens indhold: ");
        System.out.println(contents);
    }
}