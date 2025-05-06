public class Player
{
	static int totalPlayers;
	String playerName;
	public static void main(String [] args)
	{
		Player obj1=new Player();
		obj1.playerName="john";
		totalPlayers++;
		Player obj2=new Player();
		obj2.playerName="alice";
		totalPlayers++;
                System.out.println("Total players:"+totalPlayers);
		System.out.println("player1:" +obj1.playerName);
		System.out.println("player2:" +obj2.playerName);
}
}
