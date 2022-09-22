package collection_SetStudy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HashsetStudy {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("Rahul");
		hs.add("Rahul");
		hs.add("QA_automation");
		hs.add("999");
		hs.add("29.22f");
		hs.add('a');
		hs.add("true");
		hs.add(null);
		hs.add(null);
		System.out.println("=============Print HashSet info duplicates not allowed,order of insertion random================");
		System.out.println(hs);
		System.out.println(hs.size());
		//hs.set method not applicable because of indexing
		System.out.println("=============Print HashSet info using Iteartor================");
		Iterator it= hs.iterator();
		while(it.hasNext())
		{
			System.out.print(" "+it.next());
		}
		System.out.println();

//		System.out.println("=============Print HashSet info using ListIteartor not possible due to indexing================");
//		ListIterator Lit= hs.iterator();
//		while(it.hasNext())
//		{
//			System.out.print(" "+it.next());
//		}
		
//		System.out.println("=============Print HashSet info for loop not possible due to get(index) method not present in this Hashset type================");
//		for(int i=0; i<=hs.size()-1; i++)
//		{
//			System.out.println(hs.get(indexnotavailable));
//		}
		System.out.println("=============Print HashSet info using for each loop================");
		for(Object el:hs)
		{
			System.out.print(el);
		}
		System.out.println();

	}

}
