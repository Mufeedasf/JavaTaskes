class ClinicMain
{
 public static void main(String args[])
 {
	System.out.println("Main Running....");
    Doctor doctor=new Doctor("Minati",2,true,5000);
	 Clinic clinic=new Clinic("E&E",23,30);
	 clinic.show();
	System.out.println("Main Ending....");

	 
 }



}