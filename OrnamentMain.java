class OrnamentMain
{

public static void main(String[] args)
{
	System.out.println("Main Running..");
	Ornament ornament=new Ornament();
	System.out.println("ornament color:"+ornament.color);
	System.out.println("ornament material:"+ornament.material);
	System.out.println("ornament cost:"+ornament.cost);
    System.out.println("ornament name:"+ornament.name);
  System.out.println("ornament weigth:"+ornament.weigth);
  
	Ornament ornament1=new Ornament("Rolex");
	System.out.println("ornament color:"+ornament1.color);
	System.out.println("ornament material:"+ornament1.material);
	System.out.println("ornament cost:"+ornament1.cost);
	System.out.println("ornament name:"+ornament1.name);
	System.out.println("ornament weigth:"+ornament1.weigth);
	
	Ornament ornament2=new Ornament("Pandora","Metal");
	System.out.println("ornament color:"+ornament2.color);
	System.out.println("ornament material:"+ornament2.material);
	System.out.println("ornament cost:"+ornament2.cost);
	System.out.println("ornament name:"+ornament2.name);
	System.out.println("ornament weigth:"+ornament2.weigth);
	
	Ornament ornament3=new Ornament("Cartier","Gold","Necklace");
	System.out.println("ornament color:"+ornament3.color);
	System.out.println("ornament material:"+ornament3.material);
	System.out.println("ornament cost:"+ornament3.cost);
	System.out.println("ornament name:"+ornament3.name);
	System.out.println("ornament weigth:"+ornament3.weigth);
	
	Ornament ornament4=new Ornament("Graff","Silver","Ring",25);
	System.out.println("ornament color:"+ornament4.color);
	System.out.println("ornament material:"+ornament4.material);
	System.out.println("ornament cost:"+ornament4.cost);
	System.out.println("ornament name:"+ornament4.name);
	System.out.println("ornament weigth:"+ornament4.weigth);
	
	Ornament ornament5=new Ornament("Tiffany","Gold","Chain",12,599.6);
	System.out.println("ornament color:"+ornament5.color);
	System.out.println("ornament material:"+ornament5.material);
	System.out.println("ornament cost:"+ornament5.cost);
	System.out.println("ornament name:"+ornament5.name);
	System.out.println("ornament weigth:"+ornament5.weigth);
		System.out.println("Main Ending..");
	
}


}