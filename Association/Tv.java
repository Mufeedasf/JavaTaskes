class Tv
{
boolean display;
Speaker speaker;

Tv(boolean display)
{
	this.display=display;
	System.out.println("single parameteized constructor...");
	
}
void show()
{
	System.out.println("Display:"+display);
	System.out.println("Speaker information");
	if(speaker!=null)
	{
	  System.out.println("MaxVolume:"+speaker.maxVolume);

	}


	
	
}

}