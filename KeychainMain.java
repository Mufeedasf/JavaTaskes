class KeychainMain
{

public static void main(String[] args)
{
	System.out.println("Main Running..");
	Keychain keychain=new Keychain();
	System.out.println("keychain size:"+keychain.size);
	System.out.println("keychain model:"+keychain.model);
	System.out.println("keychain cost:"+keychain.cost);
    System.out.println("keychain name:"+keychain.name);
  System.out.println("keychain length:"+keychain.length);
  
	Keychain keychain1=new Keychain("small");
	System.out.println("keychain size:"+keychain1.size);
	System.out.println("keychain model:"+keychain1.model);
	System.out.println("keychain cost:"+keychain1.cost);
	System.out.println("keychain name:"+keychain1.name);
	System.out.println("keychain length:"+keychain1.length);
	
	Keychain keychain2=new Keychain("Normal","xyzzz");
	System.out.println("keychain size:"+keychain2.size);
	System.out.println("keychain model:"+keychain2.model);
	System.out.println("keychain cost:"+keychain2.cost);
	System.out.println("keychain name:"+keychain2.name);
	System.out.println("keychain length:"+keychain2.length);
	
	Keychain keychain3=new Keychain("Advance","pqrrr","carry");
	System.out.println("keychain size:"+keychain3.size);
	System.out.println("keychain model:"+keychain3.model);
	System.out.println("keychain cost:"+keychain3.cost);
	System.out.println("keychain name:"+keychain3.name);
	System.out.println("keychain length:"+keychain3.length);
	
	Keychain keychain4=new Keychain("Medium","Ijkkk","Dfg",32);
	System.out.println("keychain size:"+keychain4.size);
	System.out.println("keychain model:"+keychain4.model);
	System.out.println("keychain cost:"+keychain4.cost);
	System.out.println("keychain name:"+keychain4.name);
	System.out.println("keychain length:"+keychain4.length);
	
	Keychain keychain5=new Keychain("Adavnce","Normal","Hpppp",53,159.6);
	System.out.println("keychain size:"+keychain5.size);
	System.out.println("keychain model:"+keychain5.model);
	System.out.println("keychain cost:"+keychain5.cost);
	System.out.println("keychain name:"+keychain5.name);
	System.out.println("keychain length:"+keychain5.length);
		System.out.println("Main Ending..");
	
}


}