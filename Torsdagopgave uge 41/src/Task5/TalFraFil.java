package Task5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class TalFraFil {
    public static void main(String[] args) {
        int[] talArray = new int[5];
        int i = 0;

        String filePath = "src/Task5/";
        String fileName = filePath + "tal.txt";

        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String lines = scanner.nextLine().trim();
                if (lines.isEmpty()) continue;

                int tal = Integer.parseInt(lines);
                talArray[i] = tal;
                i++;
            }

            System.out.println("Det lykkedes! Der blev indlæst " + i + " tal:");
            System.out.println(Arrays.toString(Arrays.copyOf(talArray, i)));

        } catch (FileNotFoundException e) {
            System.out.println("FEJL: Fil ikke fundet.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("FEJL: Filen indeholder for mange tal.");
        } catch (NumberFormatException e) {
            System.out.println("FEJL: Filen indeholder ikke tal.");
        }
    }
}
