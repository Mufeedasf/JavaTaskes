class MakeupKitMain
{

public static void main(String[] args)
{
	System.out.println("Main Running..");
    MakeupKit makeupkit=new makeupkit(); 
	System.out.println("makeupkit color:"+makeupkit.color);
	System.out.println("makeupkit items:"+makeupkit.items);
	System.out.println("makeupkit cost:"+makeupkit.cost);
    System.out.println("makeupkit quality:"+makeupkit.quality);
  System.out.println("makeupkit weigth:"+makeupkit.weigth);
  
	MakeupKit makeupkit1=new MakeupKit("Lakeme");
	System.out.println("makeupkit color:"+makeupkit1.color);
	System.out.println("makeupkit items:"+makeupkit1.items);
	System.out.println("makeupkit cost:"+makeupkit1.cost);
	System.out.println("makeupkit quality:"+makeupkit1.quality);
	System.out.println("makeupkit weigth:"+makeupkit1.weigth);
	
	MakeupKit makeupkit2=new MakeupKit("Loreals","foundation");
	System.out.println("makeupkit color:"+makeupkit2.color);
	System.out.println("makeupkit items:"+makeupkit2.items);
	System.out.println("makeupkit cost:"+makeupkit2.cost);
	System.out.println("makeupkit quality:"+makeupkit2.quality);
	System.out.println("makeupkit weigth:"+makeupkit2.weigth);
	
	MakeupKit makeupkit3=new MakeupKit("Maybelline","kagal",true);
	System.out.println("makeupkit color:"+makeupkit3.color);
	System.out.println("makeupkit items:"+makeupkit3.items);
	System.out.println("makeupkit cost:"+makeupkit3.cost);
	System.out.println("makeupkit quality:"+makeupkit3.quality);
	System.out.println("makeupkit weigth:"+makeupkit3.weigth);
	
	MakeupKit makeupkit4=new MakeupKit("Revlon","eyeliner",false,25);
	System.out.println("makeupkit color:"+makeupkit4.color);
	System.out.println("makeupkit items:"+makeupkit4.items);
	System.out.println("makeupkit cost:"+makeupkit4.cost);
	System.out.println("makeupkit quality:"+makeupkit4.quality);
	System.out.println("makeupkit weigth:"+makeupkit4.weigth);
	
	MakeupKit makeupkit5=new MakeupKit("Doir","cream",false,12,499.9);
	System.out.println("makeupkit color:"+makeupkit5.color);
	System.out.println("makeupkit items:"+makeupkit5.items);
	System.out.println("makeupkit cost:"+makeupkit5.cost);
	System.out.println("makeupkit quality:"+makeupkit5.quality);
	System.out.println("makeupkit weigth:"+makeupkit5.weigth);
		System.out.println("Main Ending..");
	
}


}