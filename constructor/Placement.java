class Placement
{
	String company;
	String position;
	String criteria;
	double salary;
	int noOfOpenings;
	int noOfAttemps;
	boolean quality;
	String information;
	int scalability;
	boolean possibility;
	String PlacementOfficer;
	boolean avaliablity;
	
	Placement()
	{
		this.company="wipro";
		this.position="intern";
		this.noOfOpenings=5;
		this.criteria="Basic";
		this.salary=24999;
		this.quality=true;
		this.noOfAttemps=3;
		this.information="TrustWorthy";
		this.scalability=5;
		this.possibility=true;
		this.PlacementOfficer="Ajey";
		this.avaliablity=false;
		System.out.println("Placement Created....");
	}
	Placement(String company)
	{
	
		this.company="Tata";
		System.out.println("company Updated..");
	}
	Placement(String company,String position)
	{
		this.company=company;
		this.position="Manager";
		System.out.println("company  and position Updated..");
	}
	Placement(String information,String PlacementOfficer,boolean quality)
	{
		
		this.information=information;
		this.PlacementOfficer=PlacementOfficer;
		this.quality=quality;
	
		System.out.println("company  and position & quality Updated..");
	}
	Placement(String criteria,double salary,String PlacementOfficer,int noOfAttemps)
	{
		
		this.criteria=criteria;
		this.salary=salary;
		this.quality=quality;
		this.noOfAttemps=5;
	
		System.out.println("company  and position & quality & noOfOpenings Updated..");
	}
	
	Placement(String company,String position,boolean quality,int noOfOpenings)
	{
		
		this.company=company;
		this.position=position;
		this.quality=quality;
		this.noOfOpenings=15;
	
		System.out.println("company  and position & quality & noOfOpenings Updated..");
	}
	Placement(boolean possibility,int scalability,boolean avaliablity,int noOfOpenings)
	{
		
		this.possibility=possibility;
		this.scalability=scalability;
		this.avaliablity=avaliablity;
		this.noOfOpenings=10;
	
		System.out.println("company  and position & quality & noOfOpenings Updated..");
	}
	
	
	
	
	void display()
	{
	   System.out.println("Displaying information..");
		System.out.println("company: "+this.company);
		System.out.println("position: "+this.position);
		System.out.println("Quality: "+this.quality);
		System.out.println("salary: "+this.salary);
		System.out.println("noOfOpenings: "+this.noOfOpenings);
		System.out.println("noOfAttempsuage: "+this.noOfAttemps);
		System.out.println("criteria: "+this.criteria);
	    System.out.println("scalability: "+this.scalability);
		System.out.println("information: "+this.information);
		System.out.println("position: "+this.position);
        System.out.println("PlacementOfficer: "+this.PlacementOfficer);
		System.out.println("possibility: "+this.possibility);



		
		System.out.println("Ending information..");
	}
		
}