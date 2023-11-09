class Address
{
String street="Holekere road";
long pincode=577501;
City city;
 
 void setCity(City city)
{
	this.city=city;
}

void show()
{
	System.out.println("Showing Information..");
    
	System.out.println("street: "+this.street);
	System.out.println("pincode: "+this.pincode);
	if(this.city!=null)
	{
		this.city.show();
	}	
	System.out.println("Ending Information");
	
}
}
	

