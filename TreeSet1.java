package Set_interface_classes;

import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		
		t.add(10);
		t.add(30);
		t.add(40);
		t.add(60);
		t.add(70);
		t.add(80);
		
		//compareTo method works in backend for treeset
		//treeset cannot store duplicate and null value
		//treeSet does not follows insertion order
		//treeset follows sorting order
		//treeSet underline data structure is "...Balanced...data structure.
		//treeSet is non-synchronized data structure.
		System.out.println(t);

	}

}
