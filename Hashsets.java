package Set_interface_classes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Hashsets {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add("sachin");
		al.add("gopal");
		al.add("pune");
	
		//hashset is a implemented class of set interface
		//hashset can not store the duplicate data
		//hashset can store diffrent type of data .i.e.it is heterogenous data
		//the underline data structure of hashset is "hashtable"
		//hashset does not follows the insertion and sorting order
		//hashset backed up by map interface
		HashSet h=new HashSet(al);
		h.add(1);
		h.add("sachinq");
		h.add(null);
		h.add('f');
		h.add(true);
		System.out.println(h);
		System.out.println("arraylist:"+h.containsAll(al));
		System.out.println(h.clone());
		System.out.println(h.isEmpty());
		
		System.out.println(h.size());
		
		
		
		System.out.println("..........................Iterator....................");
		Iterator itr=h.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		h.contains("sachin");
		h.clear();
		
		
		

	}

}
