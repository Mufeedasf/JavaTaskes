class HelmetMain
{

public static void main(String[] args)
{
	System.out.println("Main Running..");
	Helmet helmet=new Helmet();
	System.out.println("helmet size:"+helmet.size);
	System.out.println("helmet model:"+helmet.model);
	System.out.println("helmet cost:"+helmet.cost);
    System.out.println("helmet name:"+helmet.name);
  System.out.println("helmet warranty:"+helmet.warranty);
  
	Helmet helmet1=new Helmet("small");
	System.out.println("helmet size:"+helmet1.size);
	System.out.println("helmet model:"+helmet1.model);
	System.out.println("helmet cost:"+helmet1.cost);
	System.out.println("helmet name:"+helmet1.name);
	System.out.println("helmet warranty:"+helmet1.warranty);
	
	Helmet helmet2=new Helmet("Normal","xyzzz");
	System.out.println("helmet size:"+helmet2.size);
	System.out.println("helmet model:"+helmet2.model);
	System.out.println("helmet cost:"+helmet2.cost);
	System.out.println("helmet name:"+helmet2.name);
	System.out.println("helmet warranty:"+helmet2.warranty);
	
	Helmet helmet3=new Helmet("Advance","pqrrr","muf");
	System.out.println("helmet size:"+helmet3.size);
	System.out.println("helmet model:"+helmet3.model);
	System.out.println("helmet cost:"+helmet3.cost);
	System.out.println("helmet name:"+helmet3.name);
	System.out.println("helmet warranty:"+helmet3.warranty);
	
	Helmet helmet4=new Helmet("Medium","Ijkkk","Delll",2);
	System.out.println("helmet size:"+helmet4.size);
	System.out.println("helmet model:"+helmet4.model);
	System.out.println("helmet cost:"+helmet4.cost);
	System.out.println("helmet name:"+helmet4.name);
	System.out.println("helmet warranty:"+helmet4.warranty);
	
	Helmet helmet5=new Helmet("Adavnce","Normal","Hpppp",3,159.6);
	System.out.println("helmet size:"+helmet5.size);
	System.out.println("helmet model:"+helmet5.model);
	System.out.println("helmet cost:"+helmet5.cost);
	System.out.println("helmet name:"+helmet5.name);
	System.out.println("helmet warranty:"+helmet5.warranty);
		System.out.println("Main Ending..");
	
}


}