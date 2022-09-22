package javaLogicalProgram;

import java.util.Scanner;

public class Scanner_CodeProgram_Birthdate {

	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		
		System.out.println("Please enter the date of birth date");
		int date=scr.nextInt();
		System.out.println("The date of birth date is "+date);
		
		System.out.println("Please enter the month of birth date");
		String month = scr.next();
		System.out.println("The month of birth date is "+month);
		
		System.out.println("Please enter the year of birthdate");
		int year = scr.nextInt();
		System.out.println("The year of birthdate is "+year);
		scr.close();
	}

}
