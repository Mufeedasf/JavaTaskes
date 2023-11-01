class Carrom
{
	String size;
	String model;
	String color;
	int noOfPaans;
	double cost;
	Carrom()
	{
		this("small","XYZ","black",12,399);
		System.out.println("Carrom Created....");
	}
	Carrom(String size)
	{
	
		this.size=size;
		System.out.println("size Updated..");
	}
	Carrom(String size,String model)
	{
		this(size);
		this.model=model;
		System.out.println("size  and model Updated..");
	}
	Carrom(String size,String model,String color)
	{
		this(size,color);
		this.color=color;
		System.out.println("size  and model & color Updated..");
	}
	Carrom(String size,String model,String color,int noOfPaans)
	{
		this(size,model,color);
		this.noOfPaans=noOfPaans;
		System.out.println("size  and model & color & noOfPaans Updated..");
	}
	
	Carrom(String size,String model,String color,int noOfPaans,double cost)
	{
		this(size,model,color,noOfPaans);
		this.cost=cost;
		System.out.println("size  and model & color & noOfPaans & cost Updated..");
	}
	
	
	
}