package controlStatement_Study;

public class Nested_If_Study    //To study the nested_IF control statement
{

	public static void main(String[] args) 
	{
	String UN="ABC";
	String PWD="xyz";
	
	if("ABC"==UN)
	{
		System.out.println("you entered correct User name UN");
		if(PWD=="xyz")
		{
			System.out.println("Correct password, login succesfuly");
		}
		else
		{
			System.out.println("Wrong password, login failed");
		}
	}
	else
	{
		System.out.println("You have enterd wrong User Name" );
	}

	}

}
