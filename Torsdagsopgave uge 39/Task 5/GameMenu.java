import java.util.ArrayList;
import java.util.Scanner;

public class GameMenu {

	private ArrayList<String> actions = new ArrayList<String>();

	public GameMenu(ArrayList<String> actions) {
		
		this.actions = actions;
	}

	public void displayMenu() {

		for (String action : actions) {
			System.out.println(action);
		}
	}

	public String promptUser() {

		System.out.println("Type a number to schoose an action.");
		displayMenu();
		System.out.print("> ");

		Scanner scanner = new Scanner(System.in);
		String choice = scanner.nextLine().trim();

		return choice;
	}
}