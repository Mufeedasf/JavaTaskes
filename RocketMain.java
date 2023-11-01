class RocketMain
{

public static void main(String[] args)
{
	System.out.println("Main Running..");
	Rocket rocket=new Rocket();
	System.out.println("rocket color:"+rocket.color);
	System.out.println("rocket material:"+rocket.material);
	System.out.println("rocket cost:"+rocket.cost);
    System.out.println("rocket length:"+rocket.length);
  System.out.println("rocket weigth:"+rocket.weigth);
  
	Rocket rocket1=new Rocket("SpaceX");
	System.out.println("rocket color:"+rocket1.color);
	System.out.println("rocket material:"+rocket1.material);
	System.out.println("rocket cost:"+rocket1.cost);
	System.out.println("rocket length:"+rocket1.length);
	System.out.println("rocket weigth:"+rocket1.weigth);
	
	Rocket rocket2=new Rocket("blue origin","Metal");
	System.out.println("rocket color:"+rocket2.color);
	System.out.println("rocket material:"+rocket2.material);
	System.out.println("rocket cost:"+rocket2.cost);
	System.out.println("rocket length:"+rocket2.length);
	System.out.println("rocket weigth:"+rocket2.weigth);
	
	Rocket rocket3=new Rocket("Rocket Lab","Aluminium",12);
	System.out.println("rocket color:"+rocket3.color);
	System.out.println("rocket material:"+rocket3.material);
	System.out.println("rocket cost:"+rocket3.cost);
	System.out.println("rocket length:"+rocket3.length);
	System.out.println("rocket weigth:"+rocket3.weigth);
	
	Rocket rocket4=new Rocket("New Shepard","copper",19,25);
	System.out.println("rocket color:"+rocket4.color);
	System.out.println("rocket material:"+rocket4.material);
	System.out.println("rocket cost:"+rocket4.cost);
	System.out.println("rocket length:"+rocket4.length);
	System.out.println("rocket weigth:"+rocket4.weigth);
	
	Rocket rocket5=new Rocket("Vulcane","Titan",9,12,10000.66);
	System.out.println("rocket color:"+rocket5.color);
	System.out.println("rocket material:"+rocket5.material);
	System.out.println("rocket cost:"+rocket5.cost);
	System.out.println("rocket length:"+rocket5.length);
	System.out.println("rocket weigth:"+rocket5.weigth);
		System.out.println("Main Ending..");
	
}


}