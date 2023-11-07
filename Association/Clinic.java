class Clinic
{
String specialization;
int totalBeds;
int totalPatients;
Doctor doctor;
Clinic(String specialization,int totalBeds,int totalPatients)
{
	this.specialization=specialization;
	this.totalBeds=totalBeds;
	this.totalPatients=totalPatients;
	
}
void show()
{
	System.out.println("specialization:"+specialization);
	System.out.println("totalBeds:"+totalBeds);
	System.out.println("totalPatients:"+totalPatients);
	System.out.println("doctor information");
	if(doctor!=null)
	{
	  System.out.println("name:"+doctor.name);
	  System.out.println("fees:"+doctor.fees);
	  System.out.println("fake:"+doctor.fake);
	  System.out.println("experience:"+doctor.exp);

	  

}
}
}