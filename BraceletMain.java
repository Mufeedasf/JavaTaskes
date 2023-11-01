class BraceletMain
{

public static void main(String[] args)
{
	System.out.println("Main Running..");
	Bracelet bracelet=new Bracelet();
	System.out.println("bracelet size:"+bracelet.size);
	System.out.println("bracelet model:"+bracelet.model);
	System.out.println("bracelet cost:"+bracelet.cost);
    System.out.println("bracelet color:"+bracelet.color);
  System.out.println("bracelet length:"+bracelet.length);
  
	Bracelet bracelet1=new Bracelet("small");
	System.out.println("bracelet size:"+bracelet1.size);
	System.out.println("bracelet model:"+bracelet1.model);
	System.out.println("bracelet cost:"+bracelet1.cost);
	System.out.println("bracelet color:"+bracelet1.color);
	System.out.println("bracelet length:"+bracelet1.length);
	
	Bracelet bracelet2=new Bracelet("Normal","xyzzz");
	System.out.println("bracelet size:"+bracelet2.size);
	System.out.println("bracelet model:"+bracelet2.model);
	System.out.println("bracelet cost:"+bracelet2.cost);
	System.out.println("bracelet color:"+bracelet2.color);
	System.out.println("bracelet length:"+bracelet2.length);
	
	Bracelet bracelet3=new Bracelet("Advance","pqrrr","green");
	System.out.println("bracelet size:"+bracelet3.size);
	System.out.println("bracelet model:"+bracelet3.model);
	System.out.println("bracelet cost:"+bracelet3.cost);
	System.out.println("bracelet color:"+bracelet3.color);
	System.out.println("bracelet length:"+bracelet3.length);
	
	Bracelet bracelet4=new Bracelet("Medium","Ijkkk","blue",12);
	System.out.println("bracelet size:"+bracelet4.size);
	System.out.println("bracelet model:"+bracelet4.model);
	System.out.println("bracelet cost:"+bracelet4.cost);
	System.out.println("bracelet color:"+bracelet4.color);
	System.out.println("bracelet length:"+bracelet4.length);
	
	Bracelet bracelet5=new Bracelet("Adavnce","Normal","grey",13,159.6);
	System.out.println("bracelet size:"+bracelet5.size);
	System.out.println("bracelet model:"+bracelet5.model);
	System.out.println("bracelet cost:"+bracelet5.cost);
	System.out.println("bracelet color:"+bracelet5.color);
	System.out.println("bracelet length:"+bracelet5.length);
		System.out.println("Main Ending..");
	
}


}