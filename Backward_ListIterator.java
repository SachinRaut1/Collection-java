package diff_Betn_Iterator_ListIterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Backward_ListIterator {

	public static void main(String[] args) {

		// by default cursor position is top of the element
		// if we want to perform in backword direction so first we have to move the
		// cursor at last
		// point of the element //so we can write code which is alredy wrote for forward
		// direction
		// but we don't want to writ like this code we can use next() for move cursor in
		// top to bottom
		// if we are performing backword dirction firstly we have to move cursor at
		// bottom
		// then we simply do like this

		ArrayList b = new ArrayList();
		// using add method we can add the element one by one
		b.add(1);
		b.add(2);
		b.add(3);
		b.add(4);
		b.add(5);
		System.out.println("-----------------------------------------");
		System.out.println(b);

		System.out.println("*******************backward*ListIterator***************************");

		ListIterator ltr = b.listIterator();

		// budefault cursor position is top
		// if we are performing backward position first we have to move cursor at bottom
		ltr.next();
		ltr.next();
		ltr.next();
		ltr.next();
		ltr.next();

		while (ltr.hasPrevious()) {
			System.out.println(ltr.previous());
		}

	}

}
