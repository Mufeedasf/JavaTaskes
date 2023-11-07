class Tent
{

  int slno;
Color color;
  int width;
  int height;


  boolean open()
{
	System.out.println("Opening tent");
	return true;
}
  boolean close()
{
	System.out.println("Opening tent");
	return false;
}
  void show(int slno,Color color,int width,int height)
{
   System.out.println("Starting information");
	System.out.println("slno:"+slno);
	System.out.println("width:"+width);
	System.out.println("height:"+height);
	if(color!=null)
	{
		System.out.println("tent color is:"+color.BLACK);
		System.out.println("tent color is:"+color.BLUE);
		System.out.println("tent color is:"+color.PINK);
		
		
	}
	System.out.println("ending information");
	
	
}

}