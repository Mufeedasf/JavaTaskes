class Technology
{
	String name;
	String safety;
	String architechture;
	double cost;
	int intelligency;
	String lang;
	boolean quality;
	String size;
	int scalability;
	boolean connectivity;
	String data;
	boolean avaliablity;
	
	Technology()
	{
		this.name="web";
		this.safety="Present";
		this.intelligency=5;
		this.architechture="Standard";
		this.cost=24999;
		this.quality=true;
		this.lang="Java";
		this.size="Large";
		this.scalability=5;
		this.connectivity=true;
		this.data="Present";
		this.avaliablity=false;
		System.out.println("Technology Created....");
	}
	Technology(String name)
	{
	
		this.name="web";
		System.out.println("name Updated..");
	}
	Technology(String name,String safety)
	{
		this.name=name;
		this.safety="NO";
		System.out.println("name  and safety Updated..");
	}
	Technology(String size,String data,boolean quality)
	{
		
		this.size=size;
		this.data=data;
		this.quality=quality;
	
		System.out.println("name  and safety & quality Updated..");
	}
	Technology(String architechture,double cost,String data,String lang)
	{
		
		this.architechture=architechture;
		this.cost=cost;
		this.quality=quality;
		this.lang="Java";
	
		System.out.println("name  and safety & quality & intelligency Updated..");
	}
	
	Technology(String name,String safety,boolean quality,int intelligency)
	{
		
		this.name=name;
		this.safety=safety;
		this.quality=quality;
		this.intelligency=35;
	
		System.out.println("name  and safety & quality & intelligency Updated..");
	}
	Technology(boolean connectivity,int scalability,boolean avaliablity,int intelligency)
	{
		
		this.connectivity=connectivity;
		this.scalability=scalability;
		this.avaliablity=avaliablity;
		this.intelligency=35;
	
		System.out.println("name  and safety & quality & intelligency Updated..");
	}
	
	
	
	
	void display()
	{
	   System.out.println("Displaying information..");
		System.out.println("Name: "+this.name);
		System.out.println("safety: "+this.safety);
		System.out.println("Quality: "+this.quality);
		System.out.println("cost: "+this.cost);
		System.out.println("intelligency: "+this.intelligency);
		System.out.println("Language: "+this.lang);
		System.out.println("architechture: "+this.architechture);
	    System.out.println("scalability: "+this.scalability);
		System.out.println("size: "+this.size);
		System.out.println("safety: "+this.safety);
        System.out.println("data: "+this.data);
		System.out.println("connectivity: "+this.connectivity);



		
		System.out.println("Ending information..");
	}
		
}