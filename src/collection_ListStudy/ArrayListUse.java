package collection_ListStudy;

import java.util.ArrayList;//Print arraylist information by using iteratorI

public class ArrayListUse {

	public static void main(String[] args) {
	ArrayList ar = new ArrayList();
	ar.add("Rahul");
	ar.add("Rahul");
	ar.add("QA automation");
	ar.add("999");
	ar.add("29.22f");
	ar.add('a');
	ar.add("true");
	ar.add(null);
	ar.add(null);
	System.out.println(ar.isEmpty());              //false
	System.out.println(ar.contains("Rahul"));     //true
	System.out.println(ar.get(5));                //a
	System.out.println(ar.indexOf("Rahul"));        //0
	System.out.println(ar.lastIndexOf("Rahul"));   //1
	
	System.out.println("=============ArrrayList================");
	System.out.println(ar);
	System.out.println(ar.size());                //7
	
	
	//insert information in between arraylist.........>Right shift operation
	System.out.println("=============ArrayList when Information added================");
	ar.add(4, "Sarth");
	System.out.println(ar);
	System.out.println(ar.size());
	
	//Delete/Remove information in between arraylist.........>Left shift operation
	System.out.println("=============ArrayList when Information removed================");
	ar.remove(4);
	System.out.println(ar);
	System.out.println(ar.size());
	
	System.out.println("=============ArrayList when Information Upadted================");
	ar.set(7, "Garuda");
	System.out.println(ar);
	System.out.println("update"+ar.size());
	
	
	
	//

	}

}
