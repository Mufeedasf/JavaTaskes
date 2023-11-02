class FreeMain
{
public static void main(String[] args)
{
	System.out.println("Main Running");
	Free free=new Free();
	free.display();
	
	Free free1=new Free("Bag");
	free1.display();
	
	Free free2=new Free("Phone","Discount",true);
	free2.display();
	
	Free free3=new Free();
	free3.display();
	
	Free free4=new Free("Book","offer");
	free4.display();
	
	Free free5=new Free();
	free5.display();
	
	System.out.println("Main Ending");
}


}