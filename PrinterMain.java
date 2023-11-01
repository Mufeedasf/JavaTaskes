class PrinterMain
{

public static void main(String[] args)
{
	System.out.println("Main Running..");
	Printer printer=new Printer();
	System.out.println("printer model:"+printer.model);
	System.out.println("printer type:"+printer.type);
	System.out.println("printer cost:"+printer.cost);
    System.out.println("printer name:"+printer.name);
  System.out.println("printer noOfPages:"+printer.noOfPages);
  
	Printer printer1=new Printer("Laser");
	System.out.println("printer model:"+printer1.model);
	System.out.println("printer type:"+printer1.type);
	System.out.println("printer cost:"+printer1.cost);
	System.out.println("printer name:"+printer1.name);
	System.out.println("printer noOfPages:"+printer1.noOfPages);
	
	Printer printer2=new Printer("Normal","Ink-jet");
	System.out.println("printer model:"+printer2.model);
	System.out.println("printer type:"+printer2.type);
	System.out.println("printer cost:"+printer2.cost);
	System.out.println("printer name:"+printer2.name);
	System.out.println("printer noOfPages:"+printer2.noOfPages);
	
	Printer printer3=new Printer("Advance","Laser","Toshiba");
	System.out.println("printer model:"+printer3.model);
	System.out.println("printer type:"+printer3.type);
	System.out.println("printer cost:"+printer3.cost);
	System.out.println("printer name:"+printer3.name);
	System.out.println("printer noOfPages:"+printer3.noOfPages);
	
	Printer printer4=new Printer("Medium","Ink-jet","Dell",250);
	System.out.println("printer model:"+printer4.model);
	System.out.println("printer type:"+printer4.type);
	System.out.println("printer cost:"+printer4.cost);
	System.out.println("printer name:"+printer4.name);
	System.out.println("printer noOfPages:"+printer4.noOfPages);
	
	Printer printer5=new Printer("Adavnce","Normal","Hp",12,5999.6);
	System.out.println("printer model:"+printer5.model);
	System.out.println("printer type:"+printer5.type);
	System.out.println("printer cost:"+printer5.cost);
	System.out.println("printer name:"+printer5.name);
	System.out.println("printer noOfPages:"+printer5.noOfPages);
		System.out.println("Main Ending..");
	
}


}