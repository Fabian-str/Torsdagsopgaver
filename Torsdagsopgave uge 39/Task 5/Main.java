import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		ArrayList<String> actions = new ArrayList<String>();

		actions.add("Start game");
		actions.add("Resume game");
		actions.add("Pause game");
		actions.add("End game");

		// TEST: System.out.println(actions.get(2));

		GameMenu menu = new GameMenu(actions);

		String userChoice = menu.promptUser();

		int action;

		try {
			action = Integer.parseInt(userChoice);
		} catch (NumberFormatException e) {
			System.out.println("Invalid unput! Please enter a number between 1 and 4.");
			return;
		}
		
		doAction(action);

	}

	public static void doAction(int action) {

		switch (action) {
		case 1:
			System.out.println("Starting the game now.");
			break;
		case 2:
			System.out.println("Fetching previously saved game data.");
			break;
		case 3:
			System.out.println("Game paused.");
			break;
		case 4:
			System.out.println("Ending game.");
			break;
		default:
			System.out.println("Unknown action: " + action);
		}
	}
}