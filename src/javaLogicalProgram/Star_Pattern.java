package javaLogicalProgram;

public class Star_Pattern {

	public static void main(String[] args) 
	{
		
		for(int i=1; i<=5; i++)      //For rows 1.i=1;  1<=5 T; 2;
			                         //         2.i=2;  2<=5 T; 3;
		{
			for(int j=i; j<=5; j++)  //for columns  1.1  j=1; 1<=1 T; 2;   Output- *
				                     //             1.2  j=2; 2<=1 F; 3;.......>condition false get out of loop
				
				                      //            2.1 j=1; 1<=2 T; 2;
				                      //            2.2 j=2; 2<=2 T; 3;   output- **
				                      //            2.3 j=3  3<=2 F;  4........false condition get out of loop
			{
				System.out.print("*");
			}
			System.out.println("");
		}


	}

}
