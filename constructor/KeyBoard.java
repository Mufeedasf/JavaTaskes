class KeyBoard
{
	String brand;
	String color="Black";
	int noOfKeys;
	String type;
	double cost;
	KeyBoard()
	{
		System.out.println("Keyboard Created..");
	}
	KeyBoard(String brand)
	{
		this.brand=brand;
		System.out.println("KeyBoard brand created..");
		
	}
	KeyBoard(int noOfKeys,String type)
	{
		this.noOfKeys=noOfKeys;
		this.type=type;
		System.out.println("KeyBoard type and noOfKeys created..");
	}
	
	KeyBoard(double cost,String color)
	{
		this.cost=cost;
		this.color=color;
		System.out.println("KeyBoard cost and color created..");
		
	}
	
	KeyBoard(int noOfKeys,String brand,double cost)
	{
		this.noOfKeys=noOfKeys;
		this.cost=cost;
		System.out.println("KeyBoard noOfKeys and brand and cost created..");
	}
	
	KeyBoard(double cost)
	{
		this.cost=cost;
		System.out.println("KeyBoard cost created..");
	}
	
	
	
}