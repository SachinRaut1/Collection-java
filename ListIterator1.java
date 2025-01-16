package diff_Betn_Iterator_ListIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIterator1 {

	public static void main(String[] args) {

		ArrayList a = new ArrayList();
		// using add method we can add the element one by one
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		System.out.println(a);

		// iterator cursor can be used with any collection object
		// hashnext return boolean value
		// next() method retun object
		System.out.println("------------------simple iterator--------------------");
		Iterator itr = a.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("*******************forward**ListIterator******************************");
		
		 ListIterator litr=a.listIterator();
		
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}

	}

}
