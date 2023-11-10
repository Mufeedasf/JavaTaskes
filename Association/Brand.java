class Brand
{
String name="HP";
long origin=1995;
String ceoName="Mufeeda";
City[] cities;
 
 void setCity(City[] cities)
{
	this.cities=cities;
}

void show()
{
	System.out.println("Showing Information..");
    
	System.out.println("name: "+this.name);
	System.out.println("origin: "+this.origin);
	if(this.cities!=null)
	{
		for(int i=0;i<this.cities.length;i++)
		{
		City ref=this.cities[i];
		System.out.println("City is: "+ref);
	}	
	}
	System.out.println("Ending Information");
	
}
}
	

