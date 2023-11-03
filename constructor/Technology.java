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
	
	Technology(String name,String safety,String architechture,double cost,int intelligency,String lang,boolean quality,Sting size,int scalability,boolean connectivity,
		  String data,boolean availability)
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
