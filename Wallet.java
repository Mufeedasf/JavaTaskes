class Wallet
{
	String brand;
	char size;
	int length;
	int weigth;
	double cost;
	Wallet()
	{
		super();
		System.out.println("Wallet Created....");
	}
	Wallet(String brand)
	{
		super();
		this.brand=brand;
		System.out.println("Brand Updated..");
	}
	Wallet(String brand,char size)
	{
		super();
		this.brand=brand;
		this.size=size;
		System.out.println("Brand  and size Updated..");
	}
	Wallet(String brand,char size,int length)
	{
		super();
		this.brand=brand;
		this.size=size;
		this.length=length;
		System.out.println("Brand  and size & length Updated..");
	}
	Wallet(String brand,char size,int length,int weigth)
	{
		super();
		this.brand=brand;
		this.size=size;
		this.length=length;
		this.weigth=weigth;
		System.out.println("Brand  and size & length & weigth Updated..");
	}
	
	Wallet(String brand,char size,int length,int weigth,double cost)
	{
		super();
		this.brand=brand;
		this.size=size;
		this.length=length;
		this.weigth=weigth;
		this.cost=cost;
		System.out.println("Brand  and size & length & weigth & cost Updated..");
	}
	
	
	
}