package Collection_Framework_practice;

import java.util.ArrayList;

public class collection_methods {
	
	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		
		//add method is use to add element
		a1.add(10);
		a1.add("sachin");
		a1.add("c");
		
		System.out.println(a1);
		
		
		ArrayList a2=new ArrayList();
		a2.add(100);
		a2.add("raut");
		a2.add("V");
		
		System.out.println("addmethod:"+a2);
		System.out.println("newElementADD"+a1.add("ssss"));
		System.out.println(a1);
		
		//using addAll() we can add all the object in one object
				//addAll () it is collection method
		a1.addAll(a2);
		System.out.println("addALLmethod:"+a1);
		
		System.out.println("containsMethod:"+a1.contains(10));
		System.out.println("containsALLMethod:"+a1.containsAll(a2));
		System.out.println("isemptyMethod:"+a2.isEmpty());
		System.out.println("sizeofobject:"+a2.size());
		System.out.println("hashcode:"+a1.hashCode());
		
		
		ArrayList a3=new ArrayList();
		a3.add(100);
		a3.add(200);
		a3.add(300);
		a3.add(400);
		a3.add(500);
		a3.add(600);
		a3.add(700);
		
		//remove(index value)
		System.out.println("removeMethodIndex:"+a3.remove(2));
		
		ArrayList a4=new ArrayList();
		a4.add("sss");
		a4.add("aaa");
		a4.add("ccc");
		a4.add("hhh");
		a4.add("iii");
		a4.add("nnn");
		
		System.out.println("removeMethodObject:"+a4.remove("sss"));
		System.out.println(a4);
		
		
		ArrayList a5=new ArrayList();
		a5.add(1);
		a5.add(2);
		a5.add(3);
		a5.add(4);
		a5.add(5);
		a5.add(6);
		
		ArrayList a6=new ArrayList();
		a6.add(1);
		a6.add(2);
		a6.add(33);
		a6.add(44);
		a6.add(54);
		a6.add(65);
		
		//removeAll method use for remove same object from one object to another object
		System.out.println("removeAll:"+ a5.removeAll(a6));
		System.out.println(a5);
		System.out.println(a6);
		
	
		
		ArrayList a7=new ArrayList();
		a7.add("a");
		a7.add("b");
		a7.add("c");
		a7.add("d");
		a7.add("r");
		a7.add("e");
		System.out.println("clearMethod:"+a7);
		//clear method is used for clear all element from thr object
		//no return type
		a7.clear();
		System.out.println("clearMethod:"+a7);
		
		
		ArrayList a8=new ArrayList();
		a8.add("a");
		a8.add("b");
		a8.add("k");
		a8.add("m");
		
		System.out.println(a8);
		
		ArrayList a9=new ArrayList();
		a9.add("a");
		a9.add("b");
		a9.add("c");
		a9.add("d");
		System.out.println(a9);

		//retainAll method use for remove the diffrent object from one object to another object
		//not deleted same object
		System.out.println("retainAllMethod:"+ a8.retainAll(a9));;
		
		System.out.println(a8);
		System.out.println(a9);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
