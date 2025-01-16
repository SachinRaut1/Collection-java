package Enumeration_cursor;

import java.util.Enumeration;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Enum_stack {

	public static void main(String[] args) {
		
		
		//List l=new Vector();

		Stack s=new Stack();
		s.add(10);
		s.add("sachin");
		s.add(78);
		
		Enumeration e=s.elements();
		
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}

}
