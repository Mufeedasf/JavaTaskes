class ClockMain
{

public static void main(String[] args)
{
	System.out.println("Main Running..");
	Clock clock=new Clock();
	System.out.println("clock brand:"+clock.brand);
	System.out.println("clock size:"+clock.size);
	System.out.println("clock cost:"+clock.cost);
    System.out.println("clock length:"+clock.length);
  System.out.println("clock weigth:"+clock.weigth);
  
	Clock clock1=new Clock("Sonata");
	System.out.println("clock brand:"+clock1.brand);
	System.out.println("clock size:"+clock1.size);
	System.out.println("clock cost:"+clock1.cost);
	System.out.println("clock length:"+clock1.length);
	System.out.println("clock weigth:"+clock1.weigth);
	
	Clock clock2=new Clock("Boat",'s');
	System.out.println("clock brand:"+clock2.brand);
	System.out.println("clock size:"+clock2.size);
	System.out.println("clock cost:"+clock2.cost);
	System.out.println("clock length:"+clock2.length);
	System.out.println("clock weigth:"+clock2.weigth);
	
	Clock clock3=new Clock("Sonata",'S',12);
	System.out.println("clock brand:"+clock3.brand);
	System.out.println("clock size:"+clock3.size);
	System.out.println("clock cost:"+clock3.cost);
	System.out.println("clock length:"+clock3.length);
	System.out.println("clock weigth:"+clock3.weigth);
	
	Clock clock4=new Clock("Boat",'L',19,25);
	System.out.println("clock brand:"+clock4.brand);
	System.out.println("clock size:"+clock4.size);
	System.out.println("clock cost:"+clock4.cost);
	System.out.println("clock length:"+clock4.length);
	System.out.println("clock weigth:"+clock4.weigth);
	
	Clock clock5=new Clock("Boat",'M',9,12);
	System.out.println("clock brand:"+clock5.brand);
	System.out.println("clock size:"+clock5.size);
	System.out.println("clock cost:"+clock5.cost);
	System.out.println("clock length:"+clock5.length);
	System.out.println("clock weigth:"+clock5.weigth);
		System.out.println("Main Ending..");
	
}


}