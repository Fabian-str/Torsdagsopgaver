import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int retireAge = 67;

		System.out.println("Please type your name:");
		String name = scanner.nextLine();
		System.out.println("Hello " + name + ". Please type yout age:");
		Integer age = scanner.nextInt();
		System.out.println("You are " + age + " years old.");
		retireAge -= age;
		System.out.println("You have " + retireAge + " years left until retirement.");
	}
}