package collection_ListStudy;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class VectorUsingIterator {

	public static void main(String[] args) {
		Vector vl = new Vector();
		vl.add("Rahul");
		vl.add("Rahul");
		vl.add("QA automation");
		vl.add("999");
		vl.add("29.22f");
		vl.add('a');
		vl.add("true");
		vl.add(null);
		vl.add(null);
		System.out.println("=============Print Vector info================");
		System.out.println(vl);
		System.out.println(vl.size());
		
		System.out.println("============= Print Vector info using ListIterator(Bidirectional) / Iterator(Unidirectional)================");
		ListIterator lit = vl.listIterator();
		
	while(lit.hasNext())
	{
		System.out.print(lit.next()+" ");
	}
		System.out.println();
		System.out.println("============= Print vector info using for loop================");
		
		for(int i=0; i<=vl.size()-1; i++)
			
		{
			System.out.print(vl.get(i)+" ");
		}
		System.out.println();
		
		System.out.println("============= Print vector info using for each loop================");
		
		for(Object v:vl)
		{
			System.out.print(v+" ");
		}
		System.out.println();
		
		System.out.println("============= Print vector info using Enumration (only applicable for legacy class) loop================");
		
		Enumeration el = vl.elements();
		while(el.hasMoreElements())
		{
			System.out.print(el.nextElement()+" ");
		}
		System.out.println();
		
	}
	

}
