package Collection_Framework_practice;

import java.util.ArrayList;

public class Indexof {

	public static void main(String[] args) {
		
		
		ArrayList a=new ArrayList();
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
		
		System.out.println(a.indexOf(40));
		
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		System.out.println(a.containsAll(a1));

	}

}
