package methodWithParameter;

public class Sample3    //Method with parameter -all type of parameter
{

	public static void main(String[] args)    //Student information like name,rollnumber,grade,percentage
	{
		
		StudentInfo("Rahul", 10, 'A', 99.9f);
		System.out.println("******************************************");
		StudentInfo("Umesh", 11, 'A', 40.22f);

	}
	
	public static void StudentInfo(String sname, int rollnum, char grade, float per) 
	{
		
		System.out.println("The name of student is "+sname);
		System.out.println("The rollnumber of student is "+rollnum);
		System.out.println("The grade od student is "+grade);
		System.out.println("The percentage of Student is "+per);
		
	}

}
