package controlStatement_Study;

public class Else_IF_Study    //Study of ELSE_IF control statement 
{

	public static void main(String[] args)
	{
		int marks=66;
		
		if(marks>=65)
		{
			System.out.println("You pass with distinction");
		}
		
		else if(marks>=60)
		{
			System.out.println("You pass with first class");
		}
		
		else if(marks>=55)
		{
			System.out.println("You pass with  higher second class");
		} 
		
		else if(marks>=50)
		{
			System.out.println("You pass with second class");
		}
		
		else if(marks>=40)
		{
		System.out.println("You are pass class");	
		}
		
		else
		{
		System.out.println("You are failed");	
		}

	}

}
