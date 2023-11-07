class Course
{
	String name;
	int duration;
	String institute;
	double cost;
	String qualification;
	String lang;
	boolean quality;
	
	Course(String name,
	int duration,
	String institute,
	double cost,
	String qualification,
	String lang,
	boolean quality,
	)
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
