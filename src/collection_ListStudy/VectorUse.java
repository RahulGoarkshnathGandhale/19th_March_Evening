package collection_ListStudy;

import java.util.Vector;

public class VectorUse {

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
		System.out.println("=============Print ArrrayList info================");
		System.out.println(vl);
		System.out.println(vl.size());
		System.out.println(vl.isEmpty());
		System.out.println(vl.contains("999"));
		System.out.println(vl.get(2));
		System.out.println(vl.indexOf("Rahul"));
		System.out.println(vl.lastIndexOf("Rahul"));
		
		//insertion of information........>right shift
		System.out.println("=============ArrayList when Information added================");
		vl.add(6, null);
		System.out.println(vl);
		System.out.println(vl.size());
		
		System.out.println("=============ArrayList when Information removed================");
		//Delete/Remove information in between arraylist.........>Left shift operation
		vl.remove(6);
		System.out.println(vl);
		System.out.println(vl.size());
		
		System.out.println("=============ArrayList when Information Upadted================");
		//Upadate of imformation 
		vl.set(5, 'B');
		System.out.println(vl);
		System.out.println(vl.size());
		
	}

}
