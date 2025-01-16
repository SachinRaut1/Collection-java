package Enumeration_cursor;

import java.util.Enumeration;
import java.util.Vector;

public class Enum_vector {

	public static void main(String[] args) {
		
		Vector lc=new Vector();
		lc.add(10);
		lc.add("sachin");
		lc.add(20);
		
		Enumeration Enum=lc.elements();
		while(Enum.hasMoreElements())
		{
			System.out.println(Enum.nextElement());
		}

	}

}
