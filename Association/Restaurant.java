<<<<<<< HEAD
class Restaurant
{
String name="5Starz";
String[] specialItems;
 
   
 
void setSpecialItems(String[] specialItems)
{
	this.specialItems=specialItems;
}

void show()
{
	System.out.println("Showing Information..");
    
	System.out.println("Name: "+this.name);
	System.out.println("specialItems:"+this.specialItems);
	if(this.specialItems!=null)
	{
		for(int i=0;i<this.specialItems.length;i++)
		{
			 String ref=this.specialItems[i];
			System.out.println("Array is:"+ref);
			
		}
		
	System.out.println("Ending Information");
	}
	
	
	
}


=======
class Restaurant
{
String name="5Starz";
String[] specialItems;
 
   
 
void setSpecialItems(String[] specialItems)
{
	this.specialItems=specialItems;
}

void show()
{
	System.out.println("Showing Information..");
    
	System.out.println("Name: "+this.name);
	System.out.println("specialItems:"+this.specialItems);
	if(this.specialItems!=null)
	{
		for(int i=0;i<this.specialItems.length;i++)
		{
			 String ref=this.specialItems[i];
			System.out.println("Array is:"+ref);
			
		}
		
	System.out.println("Ending Information");
	}
	
	
	
}


>>>>>>> 94a267a2446f7f361e383f3b34dba27cd2199898
}