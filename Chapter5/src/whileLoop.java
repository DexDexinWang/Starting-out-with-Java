import java.util.Scanner;
public class whileLoop {
	public void example()
	{
		final int MIN_PLAYERS= 9;
		final int MAX_PLAYERS= 15;
		
		int players, teamSize, teams, leftOver;
		
		Scanner keyboard =new Scanner(System.in);
		
		//Get the number of players per team.
		System.out.print("Enter the number of players per team:");
		
		teamSize = keyboard.nextInt();
		
		//Validate the input.
		while(teamSize < MIN_PLAYERS || teamSize > MAX_PLAYERS)
		{
			System.out.println("You should have at least " + MIN_PLAYERS + "but no more than "
					+ MAX_PLAYERS+" per team.");
			System.out.print("Enter the number of players per team:");
			teamSize = keyboard.nextInt();
		}
		
		//Get hte available number of players.
		
		System.out.print("Enter the avaiable number of players: ");
		players= keyboard.nextInt();
		
		//Validate the input
		while(players<0)
		{
			System.out.println("Please do not enter a negative number");
			System.out.print("Enter the avaiable number of players: ");
			players= keyboard.nextInt();
		}
		
		teams = players/teamSize;
		leftOver = players % teamSize;
		
		System.out.printf("There will be %d teams with %d players left over", teams, leftOver);
	}
}
