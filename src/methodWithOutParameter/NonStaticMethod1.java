package methodWithOutParameter;

public class NonStaticMethod1 {

	public static void main(String[] args)   //call non static method from another class
	{
		NonStaticMethodStudy NS2=new NonStaticMethodStudy();  //Creating object of another class
		NS2.myMethod3();      //calling method from another class
		NS2.myMethod4();
		
		NonStaticMethod1 NS3=new NonStaticMethod1();   //creating object of same class
		NS3.myMethod5();                              //calling method from same class 
		NS3.myMethod6();

	}
	
	public void myMethod5()
	{
		System.out.println("This is non static method5 from same class"); 
		
	}

	public void myMethod6()
	{
		System.out.println("This is non static method from same class");
	}
}
