class Bracelet
{
	String size;
	String model;
	String color;
	int length;
	double cost;
	Bracelet()
	{
		this("small","XYZ","black",12,19);
		System.out.println("Bracelet Created....");
	}
	Bracelet(String size)
	{
	
		this.size=size;
		System.out.println("size Updated..");
	}
	Bracelet(String size,String model)
	{
		this(size);
		this.model=model;
		System.out.println("size  and model Updated..");
	}
	Bracelet(String size,String model,String color)
	{
		this(size,color);
		this.color=color;
		System.out.println("size  and model & color Updated..");
	}
	Bracelet(String size,String model,String color,int length)
	{
		this(size,model,color);
		this.length=length;
		System.out.println("size  and model & color & length Updated..");
	}
	
	Bracelet(String size,String model,String color,int length,double cost)
	{
		this(size,model,color,length);
		this.cost=cost;
		System.out.println("size  and model & color & length & cost Updated..");
	}
	
	
	
}