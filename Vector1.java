package Legacy_Classes;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		
	
		Vector v=new Vector();//initial capacity is 10
			v.addElement("sachin");//vector
			v.add(100);//collection method
			v.add(2, "v");//list interface method
			v.addElement("sachin");
			v.addElement(null);
			v.addElement(null);
			
			v.setElementAt("raut", 4);
		System.out.println(v);
		
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());

		System.out.println(v.removeElement(100));
		
		v.removeElementAt(4);
		
		System.out.println(v.capacity());
		
		
		
		System.out.println(v);
	}

}
