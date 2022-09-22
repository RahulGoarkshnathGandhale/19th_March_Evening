package collection_ListStudy;

import java.nio.file.spi.FileSystemProvider;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListUsingiteratorAll {

	public static void main(String[] args) {
		LinkedList Ll= new LinkedList();
		Ll.add("Rahul");
		Ll.add("Rahul");
		Ll.add("QA automation");
		Ll.add("999");
		Ll.add("29.22f");
		Ll.add('a');
		Ll.add("true");
		Ll.add(null);
		Ll.add(null);
		System.out.println("=============Print LinkedList info================");
		System.out.println(Ll);
		System.out.println(Ll.size());
		
		System.out.println("============= Print LinkedList info using ListIterator(Bidirectional) / Iterator(Unidirectional)================");
		
		Iterator it= Ll.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next());
		}
		System.out.println();
		
		ListIterator Lit=Ll.listIterator();
		while(Lit.hasNext())
		{
			System.out.print(Lit.next());
		}
		System.out.println();
		
		System.out.println("============= Print LinkedList info using for lopp================");
		for(int i=0; i<=Ll.size()-1; i++)
		{
		System.out.print(Ll.get(i));	
		}
		System.out.println();
		
		System.out.println("============= Print LinkedList info using for each lopp================");
		
		for(Object ll1:Ll)
		{
					System.out.print(ll1);
		}
		System.out.println();
	}

}
