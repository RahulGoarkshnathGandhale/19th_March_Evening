package collection_SetStudy;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetStudy {

	public static void main(String[] args) {
		LinkedHashSet Lhs= new LinkedHashSet();
		Lhs.add("Rahul");
		Lhs.add("Rahul");
		Lhs.add("QA_automation");
		Lhs.add("999");
		Lhs.add("29.22f");
		Lhs.add('a');
		Lhs.add("true");
		Lhs.add(null);
		Lhs.add(null);
		System.out.println("=============Print HashSet info //Duplicates not allowed,order of insertion maintained================");
		System.out.println(Lhs);
		System.out.println(Lhs.size());
		
		
		System.out.println("=============Print HashSet info using Iteartor================");
		Iterator it= Lhs.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next());
		}
		System.out.println();
	
		System.out.println("=============Print HashSet info using For each loop================");
		
		for(Object e:Lhs)
		{
			System.out.print(e);
		}
		System.out.println();

	}

}
