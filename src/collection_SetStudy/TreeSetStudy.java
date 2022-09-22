package collection_SetStudy;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet(); //We can store only homogeneous data
		ts.add("Rahul");
		ts.add("ABC");
		ts.add("DEF");
		ts.add("GHI");
		ts.add("JKL");
		ts.add("MNO");
		ts.add("PQR");
		ts.add("STU");
		//ts.add("Rahul");............>Duplicates not allowed
		//ts.add(null);.........> does not allowed null values....>if used then nullpointer exception comes
		System.out.println("=============Print TreeSet info //Duplicates not allowed,order of insertion Ascending================");
		System.out.println(ts);
		System.out.println(ts.size());
		
		
		System.out.println("=============Print TreeSet info using Iteartor================");
		Iterator it= ts.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("=============Print TreeSet info using for each loop================");
		
		for(Object ets:ts)
		{
			System.out.println(ets);
		}
		
		

	}

}
