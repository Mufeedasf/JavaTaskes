class Helmet
{
	String size;
	String model;
	String name;
	int warranty;
	double cost;
	Helmet()
	{
		this("small","XYZ","udbnnxd",1,299);
		System.out.println("Helmet Created....");
	}
	Helmet(String size)
	{
	
		this.size=size;
		System.out.println("size Updated..");
	}
	Helmet(String size,String model)
	{
		this(size);
		this.model=model;
		System.out.println("size  and model Updated..");
	}
	Helmet(String size,String model,String name)
	{
		this(size,name);
		this.name=name;
		System.out.println("size  and model & name Updated..");
	}
	Helmet(String size,String model,String name,int warranty)
	{
		this(size,model,name);
		this.warranty=warranty;
		System.out.println("size  and model & name & warranty Updated..");
	}
	
	Helmet(String size,String model,String name,int warranty,double cost)
	{
		this(size,model,name,warranty);
		this.cost=cost;
		System.out.println("size  and model & name & warranty & cost Updated..");
	}
	
	
	
}