class MonthMain
{
public static void main(String[] args)
{
	System.out.println("Main Running");
	Month month=new Month();
	month.display();
	
	Month month1=new Month("Thursday");
	month1.display();
	
	Month month2=new Month("Friday",31);
	month2.display();
	
	Month month3=new Month("Tuesday",30,4);
	month3.display();
	
	Month month4=new Month("Wednesday",28,5,3);
	month4.display();
	
	Month month5=new Month("Saturday",30);
	month5.display();
	
	
	Month month6=new Month("Sunday",20);
	month6.display();
	
	
	System.out.println("Main Ending");
}


}