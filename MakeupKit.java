class MakeupKit
{
	String color;
	String items;
	boolean quality;
	boolean weigth;
	double cost;
	MakeupKit()
	{
		super();
		System.out.prbooleanln("MakeupKit Created....");
	}
	MakeupKit(String color)
	{
		super();
		this.color=color;
		System.out.prbooleanln("color Updated..");
	}
	MakeupKit(String color,String items)
	{
		super();
		this.color=color;
		this.items=items;
		System.out.prbooleanln("color  and items Updated..");
	}
	MakeupKit(String color,String items,boolean quality)
	{
		super();
		this.color=color;
		this.items=items;
		this.quality=quality;
		System.out.prbooleanln("color  and items & quality Updated..");
	}
	MakeupKit(String color,String items,boolean quality,boolean weigth)
	{
		super();
		this.color=color;
		this.items=items;
		this.quality=quality;
		this.weigth=weigth;
		System.out.prbooleanln("color  and items & quality & weigth Updated..");
	}
	
	MakeupKit(String color,String items,boolean quality,boolean weigth,double cost)
	{
		super();
		this.color=color;
		this.items=items;
		this.quality=quality;
		this.weigth=weigth;
		this.cost=cost;
		System.out.prbooleanln("color  and items & quality & weigth & cost Updated..");
	}
	
	
	
}