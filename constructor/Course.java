class Course
{
	String name;
	int duration;
	String institute;
	double cost;
	String qualification;
	String lang;
	boolean quality;
	
	Course()
	{
		this.name="Full-stack";
		this.duration=30;
		this.qualification="Graduate";
		this.institute="X-worz";
		this.cost=24999;
		this.quality=true;
		this.lang="Java";
		System.out.println("Course Created....");
	}
	Course(String name)
	{
	
		this.name="Traning";
		System.out.println("name Updated..");
	}
	Course(String name,int duration)
	{
		this.name=name;
		this.duration=28;
		System.out.println("name  and duration Updated..");
	}
	Course(String name,int duration,boolean quality)
	{
		
		this.name=name;
		this.duration=duration;
		this.quality=quality;
	
		System.out.println("name  and duration & quality Updated..");
	}
	Course(String institute,double cost,boolean quality,String lang)
	{
		
		this.institute=institute;
		this.cost=cost;
		this.quality=quality;
		this.lang="Java";
	
		System.out.println("name  and duration & quality & qualification Updated..");
	}
	
	Course(String name,int duration,boolean quality,String qualification)
	{
		
		this.name=name;
		this.duration=duration;
		this.quality=quality;
		this.qualification="PG";
	
		System.out.println("name  and duration & quality & qualification Updated..");
	}
	
	
	
	void display()
	{
	   System.out.println("Displaying information..");
		System.out.println("Name: "+this.name);
		System.out.println("duration: "+this.duration);
		System.out.println("Quality: "+this.quality);
		System.out.println("cost: "+this.cost);
		System.out.println("Qualification: "+this.qualification);
		System.out.println("Language: "+this.lang);
		System.out.println("institute: "+this.institute);
		System.out.println("Ending information..");
	}
		
}