class Person
{
String name;
Email email;
String[] email1;
   
   
   Person(String name,Email email)
   {
	   this.name=name;
	   this.email=email;
   }
void setEmail(String[] email1)
{
	this.email1=email1;
}

void show()
{
	System.out.println("Showing Information..");
    this.email.show();
	System.out.println("Name: "+this.name);
	System.out.println("Email:"+this.email);
	if(this.email1!=null)
	{
		for(int i=0;i<this.email1.length;i++)
		{
			 String ref=this.email1[i];
			System.out.println("Array is:"+ref);
			
		}
		
	System.out.println("Ending Information");
	}
	
	
	
}


}