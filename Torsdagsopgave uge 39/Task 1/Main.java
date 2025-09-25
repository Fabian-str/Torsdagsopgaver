public class Main {
	
	public static void main(String[] args) {

		Team myTeam1 = new Team("De Uovervindelige");
		myTeam1.setRank(5);

		Team myTeam2 = new Team("Vinderene");
		myTeam2.setRank(3);

		Team myTeam3 = new Team("Top Team");
		myTeam3.setRank(4);

		Team myTeam4 = new Team("Team One");
		myTeam4.setRank(6);

		Team myTeam5 = new Team("De Bedste");
		myTeam5.setRank(1);

		Team myTeam6 = new Team("Super Team");
		myTeam6.setRank(2);

		System.out.println(myTeam1);
		System.out.println(myTeam2);
		System.out.println(myTeam3);
		System.out.println(myTeam4);
		System.out.println(myTeam5);
		System.out.println(myTeam6);
	}
}