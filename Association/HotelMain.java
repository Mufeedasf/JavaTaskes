class HotelMain
{
 public static void main(String args[])
 {
	System.out.println("Main Running....");
    MenuCard menucard=new MenuCard(23,15.9);
	
	Hotel hotel=new Hotel();
	hotel.setVar("CrazyCafe","Minati",menucard);
	 hotel.show();
	System.out.println("Main Ending....");

	 
 }



}