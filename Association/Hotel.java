class Hotel
{
String name;
String ownerName;
MenuCard menucard;

  void setVar(String newName,String newOwnerName,MenuCard menucard)
  {
	  this.name=newName;
	  this.ownerName=newOwnerName;
	  this.menucard=menucard;
  }
  
  
  void show()
{
	System.out.println("name:"+name);
	System.out.println("ownerName:"+ownerName);
   System.out.println("menucard information");
	if(menucard!=null)
	{
	  System.out.println("totalItems:"+menucard.totalItems);
	  System.out.println("cost:"+menucard.cost);

	  

	}
  


}
}