package Arraylist_Methods_And_constrictor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist {

	public static void main(String[] args) {

		ArrayList a = new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		a.add(70);
		a.add(80);
		a.add(90);
		a.add(100);

		System.out.println(a);

		Iterator itr = a.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add("sachin");
		a1.add(40);
		a1.add(50);
		System.out.println(a1);

		ListIterator ltr = a1.listIterator();
		while (ltr.hasPrevious()) {
			System.out.println(ltr.previous());
		}

		//System.out.println(a.indexOf(40));// it get the index value using elements
		//System.out.println(a.containsAll(a1));// check a1 collection object present or not in a object
		System.out.println(a.set(3, "sachin"));// replace the element using index value
		System.out.println(a);
		System.out.println(a.contains(20));// check the element present or not in arraylist
		System.out.println(a.get(7));// it gets the element using index which elements present in index 7
		System.out.println(a.size());// it takes the size of an arraylist
		System.out.println(a.addAll(a1));
		System.out.println(a1);
		System.out.println(a.remove(0));
		System.out.println(a1.remove("sachin"));
		a.removeAll(a1);
		System.out.println(a1);
		a.clear();
		System.out.println(a);

	}

}
