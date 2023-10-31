class MatchBox
{
	String brand;
	int length;
	int noOfSticks;
	String type;
	double price;
	char size;
	int weigth;
	MatchBox()
	{
		System.out.println("MatchBox Created..");
	}
	MatchBox(String brand)
	{
		this.brand=brand;
		System.out.println("MatchBox brand created..");
		
	}
	MatchBox(int noOfSticks,String type)
	{
		this.noOfSticks=noOfSticks;
		this.type=type;
		System.out.println("MatchBox type and noOfSticks created..");
	}
	
	MatchBox(double price,char size)
	{
		this.price=price;
		this.size=size;
		System.out.println("MatchBox cost and color created..");
		
	}
	
	MatchBox(int noOfSticks,String brand,double price)
	{
		this.noOfSticks=noOfSticks;
		this.price=price;
		System.out.println("MatchBox noOfSticks and brand and cost created..");
	}
	
	MatchBox(int length,int weigth)
	{
		this.length=length;
		this.weigth=weigth;
		System.out.println("MatchBox length and weigth created..");
	}
	MatchBox(double price,int weigth)
	{
		this.price=price;
		this.weigth=weigth;
		System.out.println("MatchBox price and weigth created..");
	}
	
	
	
	
}