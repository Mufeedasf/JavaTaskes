class Printer
{
	String type;
	String model;
	String name;
	int noOfPages;
	double cost;
	Printer()
	{
		this("Ink-jet","Lenovo","Jetter",100,4999);
		System.out.println("Printer Created....");
	}
	Printer(String type)
	{
	
		this.type=type;
		System.out.println("type Updated..");
	}
	Printer(String type,String model)
	{
		this(type);
		this.model=model;
		System.out.println("type  and model Updated..");
	}
	Printer(String type,String model,String name)
	{
		this(type,name);
		this.name=name;
		System.out.println("type  and model & name Updated..");
	}
	Printer(String type,String model,String name,int noOfPages)
	{
		this(type,model,name);
		this.noOfPages=noOfPages;
		System.out.println("type  and model & name & noOfPages Updated..");
	}
	
	Printer(String type,String model,String name,int noOfPages,double cost)
	{
		this(type,model,name,noOfPages);
		this.cost=cost;
		System.out.println("type  and model & name & noOfPages & cost Updated..");
	}
	
	
	
}