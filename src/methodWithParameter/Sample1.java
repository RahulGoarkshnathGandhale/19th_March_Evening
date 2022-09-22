package methodWithParameter;

public class Sample1     //Method with parameter - int parameter
{

	public static void main(String[] args) 
	{
		addition(10,20);
		multiplication(2,3,4 );
		
		Sample1 s1=new Sample1();
		s1.add(10, 20, 30);

	}
	
	//Static regular method from same class with parameter(2 int parameter) (int,int)
	public static void addition(int a,int b)
	{
		int sum=a+b;
		System.out.println("The addition of two number is "+sum);
	}
	
	
	//Static regular method from same class with parameter(3 int parameter) (int,int,int)
	public static void multiplication(int a,int b, int c)
	{
		int mul=a*b*c;
		System.out.println("The multiplication of three number is "+mul);
	}

	// Non static regular method call from same class
	public void add(int a,int b,int c)
	{
		int addition=a+b;
		System.out.println("The addition of three numer by using non static method is "+addition);
	}
}
