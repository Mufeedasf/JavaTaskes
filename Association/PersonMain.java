class PersonMain
{
public static void main(String args[])
{
	System.out.println("Main Running.....");
	Domain domain=Domain.GMAIL;
	Email email=new Email(domain,25,"Carry","Minati");
	Email email2=new Email(domain,35,"Kavana","Nager");
	Email email3=new Email(domain,45,"Archana","G R");
<<<<<<< HEAD
=======
	
	
	Person person=new Person("Ajey",email);
	
>>>>>>> c7dc90be8e171fb6f4c1f14710b86cecf3c4ed9c
	String[] email1=new String[4];
	email1[0]="ABC@gmail.com";
	email1[1]="PQR@gmail.com";
	email1[2]="UVW@gmail.com";
	
	
	Person person=new Person("Ajey",email);
	
	person.setEmail(email1);
	person.show();
	
<<<<<<< HEAD
	
=======
>>>>>>> c7dc90be8e171fb6f4c1f14710b86cecf3c4ed9c
	System.out.println("Main Ending.....");
	
	
}

}
