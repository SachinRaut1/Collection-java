package diff_Betn_Iterator_ListIterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Forward_ListIterator {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		//1.) using add() method we can add the element one by one
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		System.out.println(a);
		
		//1>) we can use ListIterator only with List implemented classes
				//i.e=> Arraylist,LinkedList,vector,stack
				//2.) using Listiterator we can get element in forward and bacckword direction
				System.out.println("*******************forward**ListIterator******************************");
				
				 ListIterator litr=a.listIterator();
				
				while(litr.hasNext())
				{
					System.out.println(litr.next());
				}

	}

}
