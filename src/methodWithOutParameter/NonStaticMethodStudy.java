package methodWithOutParameter;

public class NonStaticMethodStudy {

	public static void main(String[] args)   //Call NonStatic (regular) method from same class
	{  
	
		NonStaticMethodStudy NS1=new NonStaticMethodStudy();  //Create object of same class
		NS1.myMethod3();                                   //object.methodname
		NS1.myMethod4();

	}
	
	public void myMethod3()
	{
		System.out.println("This is non static method3 from same class");
	}

	public void myMethod4()
	{
		System.out.println("This is non static method4 rom same class");
	}
}
