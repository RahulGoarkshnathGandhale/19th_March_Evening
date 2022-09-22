package collection_ListStudy;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListUsingIterator {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Rahul");
		al.add("Rahul");
		al.add("QA automation");
		al.add("999");
		al.add("29.22f");
		al.add('a');
		al.add("true");
		al.add(null);
		al.add(null);
		System.out.println("=============Print ArrrayList info================");
		System.out.println(al);
		System.out.println(al.size());
		
		System.out.println("============= Print ArrrayList info using ListIterator================");
		ListIterator lit = al.listIterator();
		while(lit.hasNext())
		{
			System.out.print(" "+lit.next());
		}
		System.out.println();

		System.out.println("============= Print ArrrayList info using for loop================");
		for(int i=0; i<=al.size()-1; i++)
		{
			System.out.print(" "+al.get(i));
		}
		System.out.println();
		System.out.println("============= Print ArrrayList info using for  each loop================");
		for(Object s:al) 
		{
			System.out.print(" "+s);
		}
		
		

	}

}
