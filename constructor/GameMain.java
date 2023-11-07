class GameMain
{
 public static void main(String args[])
 {
	System.out.println("Running main");
	 Total total=Total.ONE;
	Game game=new Game();
	Player player=new Player();
	game.show(100,total,"Candy Crash","Ancient");
	player.playGame(game);
	
	player.show();
	
	
	
	System.out.println("Ending main");


	 
 }


}