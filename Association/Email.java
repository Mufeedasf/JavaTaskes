class Email
{
Domain domain;
int id;
String fName;
String lName;

Email(Domain domain,int id,String fName,String lName)
{
	this.domain=domain;
	this.id=id;
	this.fName=fName;
	this.lName=lName;
	
}





void show()
{
	System.out.println("Showing Email Information..");
    System.out.println("id:"+this.id);
	System.out.println("FirstName: "+this.fName);
	System.out.println("LastName:"+this.lName);
	if(domain!=null)
	{
		System.out.println("Emai domain is:"+domain.GMAIL);
		System.out.println("Emai domain is:"+domain.EMAIL);
		System.out.println("Emai domain is:"+domain.YAHOO);
	}
	
		
	}

	
	
	
}



