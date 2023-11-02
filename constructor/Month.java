class Month
{
	String name;
	int noOfDays;
	int noOfWeekDays;
	int noOfHolidays;
	Month()
	{
		this.name="Thursday";
		this.noOfDays=30;
		this.noOfHolidays=2;
		System.out.println("Month Created....");
	}
	Month(String name)
	{
	
		this.name="Monday";
		System.out.println("name Updated..");
	}
	Month(String name,int noOfDays)
	{
		this.name=name;
		this.noOfDays=28;
		System.out.println("name  and noOfDays Updated..");
	}
	Month(String name,int noOfDays,int noOfWeekDays)
	{
		
		this.name=name;
		this.noOfDays=noOfDays;
		this.noOfWeekDays=noOfWeekDays;
	
		System.out.println("name  and noOfDays & noOfWeekDays Updated..");
	}
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