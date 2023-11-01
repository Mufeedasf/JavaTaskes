class Clock
{
	String brand;
	char size;
	int length;
	int weigth;
	double cost;
	Clock()
	{
		super();
		System.out.println("clock created....");
	}
	Clock(String brand)
	{
		super();
		this.brand=brand;
		System.out.println("Brand Created..");
	}
	Clock(String brand,char size)
	{
		super();
		this.brand=brand;
		this.size=size;
		System.out.println("Brand  and size Created..");
	}
	Clock(String brand,char size,int length)
	{
		super();
		this.brand=brand;
		this.size=size;
		this.length=length;
		System.out.println("Brand  and size & length Created..");
	}
	Clock(String brand,char size,int length,int weigth)
	{
		super();
		this.brand=brand;
		this.size=size;
		this.length=length;
		this.weigth=weigth;
		System.out.println("Brand  and size & length & weigth Created..");
	}
	
	Clock(String brand,char size,int length,int weigth,double cost)
	{
		super();
		this.brand=brand;
		this.size=size;
		this.length=length;
		this.weigth=weigth;
		this.cost=cost;
		System.out.println("Brand  and size & length & weigth & cost Created..");
	}
	
	
	
}