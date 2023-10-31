class ShowRoom
{
	String name;
	long zipCode=577501;
	int noOfEmps;
	String location;
	double price;
	boolean open=true;
	int noOfCars;
	long contactNo=98455764;
	
	ShowRoom()
	{
		System.out.println("ShowRoom Created..");
	}
	ShowRoom(String name)
	{
		this.name=name;
		System.out.println("ShowRoom name created..");
		
	}
	ShowRoom(int noOfEmps,String location)
	{
		this.noOfEmps=noOfEmps;
		this.location=location;
		System.out.println("ShowRoom location and noOfEmps created..");
	}
	
	ShowRoom(double price,boolean open)
	{
		this.price=price;
		this.open=open;
		System.out.println("ShowRoom cost and color created..");
		
	}
	
	ShowRoom(int noOfEmps,String name,double price)
	{
		this.noOfEmps=noOfEmps;
		this.price=price;
		System.out.println("ShowRoom noOfEmps and name and cost created..");
	}
	
	ShowRoom(int zipCode,int noOfCars)
	{
		this.zipCode=zipCode;
		this.noOfCars=noOfCars;
		System.out.println("ShowRoom zipCode and noOfCars created..");
	}
	ShowRoom(double price,int noOfCars)
	{
		this.price=price;
		this.noOfCars=noOfCars;
		System.out.println("ShowRoom price and noOfCars created..");
	}
	ShowRoom(boolean open,long contactNo)
	{
		this.open=open;
		this.contactNo=contactNo;
		System.out.println("ShowRoom open and contactNo created..");
	}
	
	
	
	
}