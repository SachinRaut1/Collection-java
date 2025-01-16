package diff_Betn_Iterator_ListIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {

	public static void main(String[] args) {

		ArrayList a = new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add("elements");
		System.out.println(a);

		System.out.println("******************iterator***********************");

		// iterator is interface
		// hashnext return boolean value
		// next() method retun object
		// next method move the cursor top to battom bydefault
		Iterator itr = a.iterator();
		
		while (itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		System.out.println("getout from wileloop");

		System.out.println("***************************remove********************************");
		
		// remove() method remove the element
		// there are two type of remove
		// 1st one is index based a
		a.remove(0);
		// second one is object based
		a.remove("elements");
		System.out.println(a);
		
		
		//notes:->

	}

}
