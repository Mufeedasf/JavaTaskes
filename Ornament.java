class Ornament
{
	String color;
	String material;
	String name;
	int weigth;
	double cost;
	Ornament()
	{
		super();
		System.out.println("Ornament Created....");
	}
	Ornament(String color)
	{
		super();
		this.color=color;
		System.out.println("color Updated..");
	}
	Ornament(String color,String material)
	{
		super();
		this.color=color;
		this.material=material;
		System.out.println("color  and material Updated..");
	}
	Ornament(String color,String material,String name)
	{
		super();
		this.color=color;
		this.material=material;
		this.name=name;
		System.out.println("color  and material & name Updated..");
	}
	Ornament(String color,String material,String name,int weigth)
	{
		super();
		this.color=color;
		this.material=material;
		this.name=name;
		this.weigth=weigth;
		System.out.println("color  and material & name & weigth Updated..");
	}
	
	Ornament(String color,String material,String name,int weigth,double cost)
	{
		super();
		this.color=color;
		this.material=material;
		this.name=name;
		this.weigth=weigth;
		this.cost=cost;
		System.out.println("color  and material & name & weigth & cost Updated..");
	}
	
	
	
}