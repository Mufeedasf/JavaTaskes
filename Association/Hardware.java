class Hardware
{
String name="Mouse";
String type="Useable";
Brand brand;
 
 void setBrand(Brand brand)
{
	this.brand=brand;
}

void show()
{
	System.out.println("Showing Information..");
    
	System.out.println("name: "+this.name);
	System.out.println("type: "+this.type);
	if(this.brand!=null)
	{
		this.brand.show();
	}	
	System.out.println("Ending Information");
	
}
}
	

