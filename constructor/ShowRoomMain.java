class ShowRoomMain
{

public static void main(String[] args)
{
	System.out.println("Main Running..");
	ShowRoom showroom=new ShowRoom();
	System.out.println("showroom name:"+showroom.name);
	System.out.println("showroom open:"+showroom.open);
	System.out.println("showroom noOfEmps:"+showroom.noOfEmps);
	System.out.println("showroom location:"+showroom.location);
	System.out.println("showroom price:"+showroom.price);
    System.out.println("showroom noOfCars:"+showroom.noOfCars);
  System.out.println("showroom zipCode:"+showroom.zipCode);
  System.out.println("showroom contact number:"+showroom.contactNo);
  
	ShowRoom showroom1=new ShowRoom("TATA SHOWROOM");
	System.out.println("showroom name:"+showroom1.name);
	System.out.println("showroom open:"+showroom1.open);
	System.out.println("showroom noOfEmps:"+showroom1.noOfEmps);
	System.out.println("showroom location:"+showroom1.location);
	System.out.println("showroom price:"+showroom1.price);
	System.out.println("showroom noOfCars:"+showroom1.noOfCars);
	System.out.println("showroom zipCode:"+showroom1.zipCode);
	System.out.println("showroom contact number:"+showroom1.contactNo);
	
	ShowRoom showroom2=new ShowRoom(45,"BTM LAYOUT");
	System.out.println("showroom name:"+showroom2.name);
	System.out.println("showroom open:"+showroom2.open);
	System.out.println("showroom noOfEmps:"+showroom2.noOfEmps);
	System.out.println("showroom location:"+showroom2.location);
	System.out.println("showroom price:"+showroom2.price);
	System.out.println("showroom noOfCars:"+showroom2.noOfCars);
	System.out.println("showroom zipCode:"+showroom2.zipCode);
	System.out.println("showroom contact number:"+showroom2.contactNo);
	
	ShowRoom showroom3=new ShowRoom(5999.9,false);
	System.out.println("showroom name:"+showroom3.name);
	System.out.println("showroom open:"+showroom3.open);
	System.out.println("showroom noOfEmps:"+showroom3.noOfEmps);
	System.out.println("showroom location:"+showroom3.location);
	System.out.println("showroom price:"+showroom3.price);
	System.out.println("showroom noOfCars:"+showroom3.noOfCars);
	System.out.println("showroom zipCode:"+showroom3.zipCode);
	  System.out.println("showroom contact number:"+showroom3.contactNo);
	  
	ShowRoom showroom4=new ShowRoom(26,"yamaha",4999.0);
	System.out.println("showroom name:"+showroom4.name);
	System.out.println("showroom open:"+showroom4.open);
	System.out.println("showroom noOfEmps:"+showroom4.noOfEmps);
	System.out.println("showroom location:"+showroom4.location);
	System.out.println("showroom price:"+showroom4.price);
	System.out.println("showroom noOfCars:"+showroom4.noOfCars);
	System.out.println("showroom zipCode:"+showroom4.zipCode);
	System.out.println("showroom contact number:"+showroom4.contactNo);
	  
	ShowRoom showroom5=new ShowRoom(577501,12);
	System.out.println("showroom name:"+showroom5.name);
	System.out.println("showroom open:"+showroom5.open);
	System.out.println("showroom noOfEmps:"+showroom5.noOfEmps);
	System.out.println("showroom location:"+showroom5.location);
	System.out.println("showroom price:"+showroom5.price);
	System.out.println("showroom noOfCars:"+showroom5.noOfCars);
	System.out.println("showroom zipCode:"+showroom5.zipCode);
	System.out.println("showroom contact number:"+showroom5.contactNo);
	
	
	ShowRoom showroom6=new ShowRoom(true,9845571);
	System.out.println("showroom name:"+showroom5.name);
	System.out.println("showroom open:"+showroom5.open);
	System.out.println("showroom noOfEmps:"+showroom5.noOfEmps);
	System.out.println("showroom location:"+showroom5.location);
	System.out.println("showroom price:"+showroom5.price);
	System.out.println("showroom noOfCars:"+showroom5.noOfCars);
	System.out.println("showroom zipCode:"+showroom5.zipCode);
	System.out.println("showroom contact number:"+showroom5.contactNo);
	
		System.out.println("Main Ending..");
	
}


}