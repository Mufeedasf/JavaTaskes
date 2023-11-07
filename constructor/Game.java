class Game
{
  int id;
  String name;
Total total;
  String origin;
  boolean play()
 {
	 System.out.println("Playing game");
	 return true;
 }
   boolean pause()
 {
	 System.out.println("Pause game");
	 return false;
 }
  boolean stop()
 {
	 System.out.println("Stopping game");
	 return false;
 }
 void show(int id, Total total,String origin,String name)
 {
	 System.out.println("Starting information");
     System.out.println("id:"+id);
	 System.out.println("name:"+name);
	 if(total!=null)
	 {
		 System.out.println("Player:"+total.ONE);
		 System.out.println("Player:"+total.TWO);
		 System.out.println("Player:"+total.THREE);
		 
	 }
	 System.out.println("origin:"+origin);
	 System.out.println("ending information");

	 
 }



}