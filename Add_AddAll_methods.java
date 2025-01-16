package Collection_Framework_practice;

import java.util.ArrayList;

public class Add_AddAll_methods {

	public static void main(String[] args) {
		//using add method we can add the elements in arraylist
		//Add() returntype is boolean
		ArrayList a1=new ArrayList();
		a1.add("aaa");
		a1.add("bbb");
		a1.add("ccc");
		System.out.println(a1);
		System.out.println(a1.add(222));
		System.out.println(a1.size());
		System.out.println(a1.remove("bbb"));
		a1.clear();
		System.out.println(a1);
		
		
		
		ArrayList a2=new ArrayList();
		a2.add(111);
		a2.add(222);
		a2.add(333);
		System.out.println(a2);
		System.out.println(a2.removeAll(a1));
		
		//contains() check the value are present in object or not
		//return type is boolean
		System.out.println(a2.contains(555));
		System.out.println(a2.isEmpty());//boolean rtype
		
		
		//using addAll() we can add all the object in one object
		//addAll () it is collection method
		a1.addAll(a2);
		System.out.println(a1);
		

	}

}
