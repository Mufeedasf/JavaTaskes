class Rocket
{
	String color;
	String material;
	int length;
	int weigth;
	double cost;
	Rocket()
	{
		super();
		System.out.println("Rocket Created....");
	}
	Rocket(String color)
	{
		super();
		this.color=color;
		System.out.println("color Updated..");
	}
	Rocket(String color,String material)
	{
		super();
		this.color=color;
		this.material=material;
		System.out.println("color  and material Updated..");
	}
	Rocket(String color,String material,int length)
	{
		super();
		this.color=color;
		this.material=material;
		this.length=length;
		System.out.println("color  and material & length Updated..");
	}
	Rocket(String color,String material,int length,int weigth)
	{
		super();
		this.color=color;
		this.material=material;
		this.length=length;
		this.weigth=weigth;
		System.out.println("color  and material & length & weigth Updated..");
	}
	
	Rocket(String color,String material,int length,int weigth,double cost)
	{
		super();
		this.color=color;
		this.material=material;
		this.length=length;
		this.weigth=weigth;
		this.cost=cost;
		System.out.println("color  and material & length & weigth & cost Updated..");
	}
	
	
	
}