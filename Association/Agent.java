class Agent
{
  int id=111;
  String company="Trip Planner";
  String name="Minati";
Tent tent;

  void  openTent(Tent tent)
{
	System.out.println("OpenTent Runing");
	System.out.println(tent.open());
	System.out.println(tent.slno);
	System.out.println(tent.color);
	System.out.println(tent.width);
	System.out.println(tent.height);
	System.out.println("OpenTent Ending");
	
}
void  closeTent(Tent tent)
{
	System.out.println("CloseTent Runing");
	System.out.println(tent.close());
	System.out.println(tent.slno);
	System.out.println(tent.color);
	System.out.println(tent.width);
	System.out.println(tent.height);
	System.out.println("CloseTent Ending");
	
}
 
 void show()
{
	System.out.println("Starting information");
    System.out.println("id:"+id);
	System.out.println("name:"+name);
	System.out.println("company:"+company);
	System.out.println("ending information");

	
}




}
