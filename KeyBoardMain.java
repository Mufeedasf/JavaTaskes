class KeyBoardMain
{

public static void main(String[] args)
{
	System.out.println("Main Running..");
	KeyBoard keyboard=new KeyBoard();
	System.out.println("keyboard brand:"+keyboard.brand);
	System.out.println("keyboard color:"+keyboard.color);
	System.out.println("keyboard noOFKeys:"+keyboard.noOfKeys);
	System.out.println("keyboard type:"+keyboard.type);
	System.out.println("keyboard cost:"+keyboard.cost);
	
	KeyBoard keyboard1=new KeyBoard("Korg");
	System.out.println("keyboard brand:"+keyboard1.brand);
	System.out.println("keyboard color:"+keyboard1.color);
	System.out.println("keyboard noOFKeys:"+keyboard1.noOfKeys);
	System.out.println("keyboard type:"+keyboard1.type);
	System.out.println("keyboard cost:"+keyboard1.cost);
	
	KeyBoard keyboard2=new KeyBoard(106,"Wired");
	System.out.println("keyboard brand:"+keyboard2.brand);
	System.out.println("keyboard color:"+keyboard2.color);
	System.out.println("keyboard noOFKeys:"+keyboard2.noOfKeys);
	System.out.println("keyboard type:"+keyboard2.type);
	System.out.println("keyboard cost:"+keyboard2.cost);
	
	KeyBoard keyboard3=new KeyBoard(599,"Black");
	System.out.println("keyboard brand:"+keyboard3.brand);
	System.out.println("keyboard color:"+keyboard3.color);
	System.out.println("keyboard noOFKeys:"+keyboard3.noOfKeys);
	System.out.println("keyboard type:"+keyboard3.type);
	System.out.println("keyboard cost:"+keyboard3.cost);
	
	KeyBoard keyboard4=new KeyBoard(106,"yamaha",499);
	System.out.println("keyboard brand:"+keyboard4.brand);
	System.out.println("keyboard color:"+keyboard4.color);
	System.out.println("keyboard noOFKeys:"+keyboard4.noOfKeys);
	System.out.println("keyboard type:"+keyboard4.type);
	System.out.println("keyboard cost:"+keyboard4.cost);
	
	KeyBoard keyboard5=new KeyBoard(799);
	System.out.println("keyboard brand:"+keyboard5.brand);
	System.out.println("keyboard color:"+keyboard5.color);
	System.out.println("keyboard noOFKeys:"+keyboard5.noOfKeys);
	System.out.println("keyboard type:"+keyboard5.type);
	System.out.println("keyboard cost:"+keyboard5.cost);
		System.out.println("Main Ending..");
	
}


}