class TechnologyMain
{
public static void main(String[] args)
{
	System.out.println("Main Running");
	Technology technology=new Technology();
	technology.display();
	
	Technology technology1=new Technology("Full-stack");
	technology1.display();
	
	Technology technology2=new Technology("Training","Available");
	technology2.display();
	
	Technology technology3=new Technology("Small","Present",false);
	technology3.display();
	
	Technology technology4=new Technology("Web","Standard",true,15);
	technology4.display();
	
	Technology technology5=new Technology(true,34,false,25);
	technology5.display();
	
	
	Technology technology6=new Technology("Advance",3999.9,"Half","Python");
	technology6.display();
	
	
	System.out.println("Main Ending");
}


}