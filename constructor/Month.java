class Month
{
	String name;
	int noOfDays;
	int noOfWeekDays;
	int noOfHolidays;
	
	Month(String name,int noOfDays,int noOfWeekDays,int noOfHolidays)
	{
		
		this.name=name;
		this.noOfDays=noOfDays;
		this.noOfWeekDays=noOfWeekDays;
		this.noOfHolidays=4;
	
		System.out.println("name  and noOfDays & noOfWeekDays & noOfHolidays Updated..");
	}
	
	void display()
	{
	   System.out.println("Displaying information..");
		System.out.println("Day is: "+this.name);
		System.out.println("no Of Days : "+this.noOfDays);
		System.out.println("no Of WeekDays: "+this.noOfWeekDays);
		System.out.println("no Of Holidays: "+this.noOfHolidays);
		System.out.println("Ending information..");
	}
		
}
