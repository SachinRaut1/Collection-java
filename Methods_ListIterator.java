package diff_Betn_Iterator_ListIterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Methods_ListIterator {

	public static void main(String[] args) {
		
		ArrayList a=new ArrayList();
		//1.) using add() method we can add the element one by one
		a.add(1);
		a.add("raut");
		a.add(3);
		a.add("sachin");
		a.add(5);
		System.out.println(a);
		
		//2.)hasNext()=>read the element ,(3)next()=>move the cursor
		ListIterator litr = a.listIterator();
		
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		//4>)remove(),(5)set() replace the element following index value
		System.out.println(a.remove(0));
		a.remove("sachin");
		//set method use for replace the element
		a.set(1, "gopal");
		a.add("sunil");
		a.add(100);
		System.out.println(a);
		

	}

}
