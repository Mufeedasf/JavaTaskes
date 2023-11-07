class Player
{
  String name="Carry";
 Game game;
  void playGame(Game game)
 {
	 System.out.println("PlayGame Running..");
	 System.out.println(game.play());
	System.out.println(game.id);
	System.out.println(game.origin);
	System.out.println(game.total);
	System.out.println(game.name);
	 
	 System.out.println("playGame Ending...");
	 
 }
 void pauseGame()
 {
	 System.out.println("PauseGame Running");
	  System.out.println(game.pause());
	System.out.println(game.id);
	System.out.println(game.origin);
	System.out.println(game.total);
	System.out.println(game.name);
	System.out.println("pauseGame Ending...");
	 
 }
 void stopGame()
 {
	 System.out.println("StopGame Running...");
	 System.out.println(game.stop());
	System.out.println(game.id);
	System.out.println(game.origin);
	System.out.println(game.total);
	System.out.println(game.name);
	System.out.println("StopGame Ending...");
	 
 }
 void show()
 {
	 System.out.println("showing information");
	 System.out.println("name:"+name);
	System.out.println("Ending information");
	 
 }



}