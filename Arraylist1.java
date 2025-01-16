package Collection_Framework_practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// arraylist isa implemented class of list interface and list interface extends
		// collection
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add("sachin");
		a1.add("c");
		System.out.println(a1);
		
		//this classes inherit list interface=>arraylist,Linkedlist,vector(legacy class from version
		//1.0 means old version,stack(lc)
		System.out.println("**************ArrayList*************");
		List l1=new ArrayList();
		l1.add(111);
		l1.add("gopal");
		System.out.println(l1);
		
		System.out.println("**************LinkedList*************");
		List l2=new LinkedList();
		l2.add(122);
		l2.add("om");
		System.out.println(l2);
		
		System.out.println("**************Vector*************");
		List l3=new Vector();
		l3.add("name");
		l3.add(19);
		l3.add("c");
		System.out.println(l3);
		
		System.out.println("**************Stack*************");
		List l4=new Stack();
		l4.add(1111);
		l4.add("sunil");
		l4.add("c");
		System.out.println(l4);
		
		System.out.println("**************HashSet*************");
		HashSet h1=new HashSet();
		h1.add(11);
		h1.add("rahul");
		h1.add("s");
		System.out.println(h1);
		
		//both are collection object
	}

}
