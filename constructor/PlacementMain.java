class PlacementMain
{
public static void main(String[] args)
{
	System.out.println("Main Running");
	Placement placement=new Placement();
	placement.display();
	
	Placement placement1=new Placement("IBM");
	placement1.display();
	
	Placement placement2=new Placement("Wipro","intern");
	placement2.display();
	
	Placement placement3=new Placement("Trust","Nager",false);
	placement3.display();
	
	Placement placement4=new Placement("Advance","manager",true,15);
	placement4.display();
	
	Placement placement5=new Placement(true,34,false,25);
	placement5.display();
	
	
	Placement placement6=new Placement("Advance",3999.9,"Harsh",5);
	placement6.display();
	
	
	System.out.println("Main Ending");
}


}