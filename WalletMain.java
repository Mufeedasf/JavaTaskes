class WalletMain
{

public static void main(String[] args)
{
	System.out.println("Main Running..");
	Wallet wallet=new Wallet();
	System.out.println("wallet brand:"+wallet.brand);
	System.out.println("wallet size:"+wallet.size);
	System.out.println("wallet cost:"+wallet.cost);
    System.out.println("wallet length:"+wallet.length);
  System.out.println("wallet weigth:"+wallet.weigth);
  
	Wallet wallet1=new Wallet("WildHorn");
	System.out.println("wallet brand:"+wallet1.brand);
	System.out.println("wallet size:"+wallet1.size);
	System.out.println("wallet cost:"+wallet1.cost);
	System.out.println("wallet length:"+wallet1.length);
	System.out.println("wallet weigth:"+wallet1.weigth);
	
	Wallet wallet2=new Wallet("Titan",'s');
	System.out.println("wallet brand:"+wallet2.brand);
	System.out.println("wallet size:"+wallet2.size);
	System.out.println("wallet cost:"+wallet2.cost);
	System.out.println("wallet length:"+wallet2.length);
	System.out.println("wallet weigth:"+wallet2.weigth);
	
	Wallet wallet3=new Wallet("puma",'S',12);
	System.out.println("wallet brand:"+wallet3.brand);
	System.out.println("wallet size:"+wallet3.size);
	System.out.println("wallet cost:"+wallet3.cost);
	System.out.println("wallet length:"+wallet3.length);
	System.out.println("wallet weigth:"+wallet3.weigth);
	
	Wallet wallet4=new Wallet("HORNBULL",'L',19,25);
	System.out.println("wallet brand:"+wallet4.brand);
	System.out.println("wallet size:"+wallet4.size);
	System.out.println("wallet cost:"+wallet4.cost);
	System.out.println("wallet length:"+wallet4.length);
	System.out.println("wallet weigth:"+wallet4.weigth);
	
	Wallet wallet5=new Wallet("URBAN FOREST",'M',9,12);
	System.out.println("wallet brand:"+wallet5.brand);
	System.out.println("wallet size:"+wallet5.size);
	System.out.println("wallet cost:"+wallet5.cost);
	System.out.println("wallet length:"+wallet5.length);
	System.out.println("wallet weigth:"+wallet5.weigth);
		System.out.println("Main Ending..");
	
}


}