class LaptopMain
{
public static void main(String args[])
{
	System.out.println("Main Running.....");
	Hardware hardware=new Hardware();
	Hardware hardware1=new Hardware();
	Hardware hardware2=new Hardware();
	Hardware hardware3=new Hardware();
	Hardware hardware4=new Hardware();
	
	Hardware[] hardwareArray={hardware,hardware2,hardware3,hardware4};
	City city=new City();
	City city1=new City();
	City city2=new City();
	City city3=new City();
	City city4=new City();
	
	Address address=new Address();
	City[] citites={city,city1,city2,city3,city4};
	Laptop laptop=new Laptop();
	
	Brand brand=new Brand();
	Owner owner=new Owner();
	
	hardware.setBrand(brand);
	owner.setPaddress(address);
	owner.setTaddress(address);
	address.setCity(city);
	
	
	laptop.setBrand(brand);
	laptop.setOwner(owner);
	
	laptop.show();
	System.out.println("Main Ending.....");
	
	
}

}