<<<<<<< HEAD
class Canteen
{
String type="Non-Stick";
String[] utensils;
 
   
 
void setUtensils(String[] utensils)
{
	this.utensils=utensils;
}

void show()
{
	System.out.println("Showing Information..");
    
	System.out.println("type: "+this.type);
	System.out.println("utensils:"+this.utensils);
	if(this.utensils!=null)
	{
		for(int i=0;i<this.utensils.length;i++)
		{
			 String ref=this.utensils[i];
			System.out.println("Utensils are:"+ref);
			
		}
		
	System.out.println("Ending Information");
	}
	
	
	
}


=======
class Canteen
{
String type="Non-Stick";
String[] utensils;
 
   
 
void setUtensils(String[] utensils)
{
	this.utensils=utensils;
}

void show()
{
	System.out.println("Showing Information..");
    
	System.out.println("type: "+this.type);
	System.out.println("utensils:"+this.utensils);
	if(this.utensils!=null)
	{
		for(int i=0;i<this.utensils.length;i++)
		{
			 String ref=this.utensils[i];
			System.out.println("Utensils are:"+ref);
			
		}
		
	System.out.println("Ending Information");
	}
	
	
	
}


>>>>>>> 94a267a2446f7f361e383f3b34dba27cd2199898
}