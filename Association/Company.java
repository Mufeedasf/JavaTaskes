class Company
{
String name="IBM";
String gstno="ibm11";
 String location="bng";
 Job job;

void show()
{
	System.out.println("name:"+name);
	System.out.println("gstno:"+gstno);
	System.out.println("location:"+location);
	System.out.println("job information");
	if(job!=null)
	{
	  System.out.println("Role:"+job.role);
	  System.out.println("salary:"+job.salary);
	  System.out.println("type:"+job.type);
	  

	  

	}
}
}