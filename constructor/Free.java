class Free
{
	String what;
	String why;
	boolean freeForAll;
	
	Free(String what,String why,boolean freeForAll)
	{
		
		this.what=what;
		this.why=why;
		this.freeForAll=freeForAll;
	
		System.out.println("what  and why & freeForAll Updated..");
	}
	void display()
	{
	   System.out.println("Displaying information..");
		System.out.println("Free product is: "+this.what);
		System.out.println("Reason : "+this.why);
		System.out.println("Free for all: "+this.freeForAll);
		System.out.println("Ending information..");
	}
		
}
