class MatchBoxMain
{

public static void main(String[] args)
{
	System.out.println("Main Running..");
	MatchBox matchbox=new MatchBox();
	System.out.println("matchbox brand:"+matchbox.brand);
	System.out.println("matchbox size:"+matchbox.size);
	System.out.println("matchbox noOfSticks:"+matchbox.noOfSticks);
	System.out.println("matchbox type:"+matchbox.type);
	System.out.println("matchbox price:"+matchbox.price);
    System.out.println("matchbox length:"+matchbox.length);
  System.out.println("matchbox weigth:"+matchbox.weigth);
  
	MatchBox matchbox1=new MatchBox("Rajshree");
	System.out.println("matchbox brand:"+matchbox1.brand);
	System.out.println("matchbox size:"+matchbox1.size);
	System.out.println("matchbox noOfSticks:"+matchbox1.noOfSticks);
	System.out.println("matchbox type:"+matchbox1.type);
	System.out.println("matchbox price:"+matchbox1.price);
	System.out.println("matchbox length:"+matchbox1.length);
	System.out.println("matchbox weigth:"+matchbox1.weigth);
	
	MatchBox matchbox2=new MatchBox(45,"normal");
	System.out.println("matchbox brand:"+matchbox2.brand);
	System.out.println("matchbox size:"+matchbox2.size);
	System.out.println("matchbox noOfSticks:"+matchbox2.noOfSticks);
	System.out.println("matchbox type:"+matchbox2.type);
	System.out.println("matchbox price:"+matchbox2.price);
	System.out.println("matchbox length:"+matchbox2.length);
	System.out.println("matchbox weigth:"+matchbox2.weigth);
	
	MatchBox matchbox3=new MatchBox(59.9,'S');
	System.out.println("matchbox brand:"+matchbox3.brand);
	System.out.println("matchbox size:"+matchbox3.size);
	System.out.println("matchbox noOfSticks:"+matchbox3.noOfSticks);
	System.out.println("matchbox type:"+matchbox3.type);
	System.out.println("matchbox price:"+matchbox3.price);
	System.out.println("matchbox length:"+matchbox3.length);
	System.out.println("matchbox weigth:"+matchbox3.weigth);
	
	MatchBox matchbox4=new MatchBox(26,"yamaha",49);
	System.out.println("matchbox brand:"+matchbox4.brand);
	System.out.println("matchbox size:"+matchbox4.size);
	System.out.println("matchbox noOfSticks:"+matchbox4.noOfSticks);
	System.out.println("matchbox type:"+matchbox4.type);
	System.out.println("matchbox price:"+matchbox4.price);
	System.out.println("matchbox length:"+matchbox4.length);
	System.out.println("matchbox weigth:"+matchbox4.weigth);
	
	MatchBox matchbox5=new MatchBox(9,12);
	System.out.println("matchbox brand:"+matchbox5.brand);
	System.out.println("matchbox size:"+matchbox5.size);
	System.out.println("matchbox noOfSticks:"+matchbox5.noOfSticks);
	System.out.println("matchbox type:"+matchbox5.type);
	System.out.println("matchbox price:"+matchbox5.price);
	System.out.println("matchbox length:"+matchbox5.length);
	System.out.println("matchbox weigth:"+matchbox5.weigth);
		System.out.println("Main Ending..");
	
}


}