import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {

		ArrayList<String> actions = new ArrayList<String>();

		actions.add("Start game");
		actions.add("Resume game");
		actions.add("Pause game");
		actions.add("End game");

		// TEST: System.out.println(actions.get(2));

		GameMenu menu = new GameMenu(actions);
		menu.displayMenu();
	}
}