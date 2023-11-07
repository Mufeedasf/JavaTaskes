class TentMain
{
 public static void main(String args[])
 {
	System.out.println("Running main");
	Color color=Color.BLACK;
	Tent tent=new Tent();
	Agent agent=new Agent();
	tent.show(25,color,15,10);
	agent.openTent(tent);
	agent.closeTent(tent);
	agent.show();
	
	
	
	System.out.println("Ending main");


	 
 }


}