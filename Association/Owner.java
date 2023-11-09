class Owner
{
String name="Mufeeda";
String email="mufee@gmail.com";
Address pAddress;
Address tAddress;
 
 void setPaddress(Address pAddress)
{
	this.pAddress=pAddress;
}
void setTaddress(Address tAddress)
{
	this.tAddress=tAddress;
}

void show()
{
	System.out.println("Showing Information..");
    
	System.out.println("name: "+this.name);
	System.out.println("email: "+this.email);
	if(this.pAddress!=null)
	{
		this.pAddress.show();
	}
	if(this.tAddress!=null)
	{
		this.tAddress.show();
	}
	
	System.out.println("Ending Information");
	
}
}
	

