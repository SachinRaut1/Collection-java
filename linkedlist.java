package Linked_List;

import java.util.ArrayList;
import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {


		//linkedlist follows the insertion the insertion order
		//linkedlist can store diffrent type of data
		//it can store duplicate data structure
		//it can store multiple null values
		//linkedd list are index based data structure
		
		ArrayList arr=new ArrayList();
		arr.add(100);
		arr.add("moin");
		LinkedList l=new LinkedList(arr);
		l.add("sachin");
		l.add("sachin");
		l.add(null);
		l.add(null);
		l.add('c');
		l.add(1);
		l.add(2);
		
		System.out.println(l);
		l.addFirst("gopal");
		l.addLast("raut");
		System.out.println(l);
		
		System.out.println("get first element:->"+l.getFirst());
		System.out.println("get last element:->"+l.getLast());
		
		System.out.println("remove 1st Element:->"+l.removeFirst());
		System.out.println("remove last element:->"+l.removeLast());
		System.out.println(l);

	}

}
