package Task2;

import java.util.Scanner;

public class TalFraBruger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Indtast dit fødselsår:");
                String input = scanner.nextLine();
                int number = Integer.parseInt(input);
                break;
            }
            catch (Exception e) {
                System.out.println("Fejl: " + e.getMessage());
                System.out.println("Input skal være et heltal. Prøv igen: ");
            }
        }
        // Brug Integer.parseInt til at konvertere input til int
        // Beregn brugerens alder (antag at nuværende år er 2025)
        // Print alderen
    }
}