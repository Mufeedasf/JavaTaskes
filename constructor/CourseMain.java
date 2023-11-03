class CourseMain
{
public static void main(String[] args)
{
	System.out.println("Main Running");
	Course course=new Course();
	course.display();
	
	Course course1=new Course("Full-stack");
	course1.display();
	
	Course course2=new Course("Training",31);
	course2.display();
	
	Course course3=new Course("BBA",4,false);
	course3.display();
	
	Course course4=new Course("BCA",3,true,"C");
	course4.display();
	
	Course course5=new Course("MCA",2,false,"Graduate");
	course5.display();
	
	
	Course course6=new Course("Vtu",3999.9,false,"UG");
	course6.display();
	
	
	System.out.println("Main Ending");
}


}