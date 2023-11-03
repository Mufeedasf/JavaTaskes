class CourseMain
{
public static void main(String[] args)
{
	System.out.println("Main Running");
	Course course=new Course("BCA",30,"UBDT",2999,89.0,"PG","C",true);
	course.display();
	
	Course course1=new Course("Full-stack",30,"UBDT",2999,89.0,"PG","C",true);
	course1.display();
	
	Course course2=new Course("Training",31,"UBDT",2999,19.0,"PG","C++",true);
	course2.display();
	
	Course course3=new Course("BBA",4,"vtu",1999,89.0,"PG","C",true);
	course3.display();
	
	Course course4=new Course("BCA",3,true,"C","PG","C",true);
	course4.display();
	
	Course course5=new Course("MCA",2,false,"Graduate","java",false);
	course5.display();
	
	
	Course course6=new Course("BCA",30,"UBDT",2999,89.0,"PG","C",true);
	course6.display();
	
	Course course7=new Course("BCA",30,"UBDT",2999,89.0,"PG","C",true);
	course7.display();
	
	Course course8=new Course("Full-stack",30,"UBDT",2999,89.0,"PG","C",true);
	course8.display();
	
	Course course9=new Course("Training",31,"UBDT",2999,19.0,"PG","C++",true);
	course9.display();
	
	Course course10=new Course("BBA",4,"vtu",1999,89.0,"PG","C",true);
	course10.display();
	
	Course course11=new Course("BCA",3,true,"C","PG","C",true);
	course11.display();
	
	Course course12=new Course("MCA",2,false,"Graduate","java",false);
	course12.display();
	

	System.out.println("Main Ending");
}


}
