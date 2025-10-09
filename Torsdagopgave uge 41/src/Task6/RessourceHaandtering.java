package Task6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RessourceHaandtering {

    public static void main(String[] args) {
        RessourceHaandtering rh = new RessourceHaandtering();
        rh.laesOgSkrivFil("src/Task6/input.txt", "src/Task6/output.txt");
    }

    public void laesOgSkrivFil(String inputFil, String outputFil) {
        Scanner scanner = null;
        PrintWriter writer = null;

        try {
            scanner = new Scanner(new File(inputFil));
            writer = new PrintWriter(outputFil);
            while (scanner.hasNextLine()) {
                String lines = scanner.nextLine();
                writer.println(lines);
            }
            System.out.println("Filen blev kopieret fra" + inputFil + " til " + outputFil + ".");
        } catch (FileNotFoundException e) {
            System.out.println("FEJL: Filen blev ikke fundet.");
        } finally {
            if (scanner != null) {
                try {
                    scanner.close();
                } catch (Exception e) {
                    System.out.println("FEJL: Fejl ved lukning af scanner: " + e.getMessage());
                }
            }
            if (writer != null) {
                try {
                    writer.close();
                } catch (Exception e) {
                    System.out.println("FEJL: Fejl ved lukning af writer: " + e.getMessage());
                }
            }
            // Luk både scanner og writer hvis de ikke er null
            // Håndter eventuelle exceptions her også
        }
    }
}
