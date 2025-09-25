import java.util.Scanner;
import java.util.Random;

public class GuessNumberGame {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter name: ");
		String name = scanner.nextLine();
		System.out.print("Hello " + name + ", and welcome to the guessing game! ");

		Random random = new Random();
		int secretNumber = random.nextInt(100) + 1;

		int guess = 0;
		int attempts = 0;
		int maxAttempts = 10;

		while (guess != secretNumber && attempts < maxAttempts) {

			System.out.print("Enter your guess between 1 and 100.");

			if (scanner.hasNextInt()) {

				guess = scanner.nextInt();
				attempts++;

				if (guess < secretNumber) {
					System.out.print("The number is higher. You have used: " + attempts + "/10. ");
				} else if (guess > secretNumber) {
					System.out.print("The number is lower. You have used: " + attempts + "/10. ");
				} else if (guess == secretNumber) {
					System.out.print("Congratulations " + name + ", you guessed the number!");
				}
				
			} else {

				System.out.println("Invalid input! Please efter a number.");
				scanner.next();
			}
		}
	}
}