import java.util.ArrayList;

public class Team {
	
	private String teamName;
	private int rank;
	private ArrayList<String> playerNames = new ArrayList<String>();

	public Team(String teamName) {
		this.teamName = teamName;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public void addPlayer(String name) {
		playerNames.add(name);
	}

	@Override
	public String toString() {
		return "Hold: " + teamName + " Rank: " + rank;
	}

	public ArrayList<String> getPlayerNames() {
		return playerNames;
	}
}