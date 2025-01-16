package Diffrence_Betn_List_And_Set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo1 {

	public static void main(String[] args) {
		
		
		List l1=new ArrayList();
		//1.) list is an (index) based data structure
		l1.add(0,10);
		l1.add(20);
		l1.add(2,30);
		
		//3.) list can store th any noof duplicate values
		l1.add(50);
		l1.add(50);
		
		//4) list can store any no of null values 
		l1.add(null);
		l1.add(null);
		
		//2.) list follows the insertion order beacuse of index
		System.out.println(l1);
		
		System.out.println("----------------ListIterator----------------------");
		//5.) we can iterate (get) the element by iterator or listiterator
		//we can can get the data forword and backword direction
		//iterator print the element one after another line by line means sequencely
		ListIterator litr=l1.listIterator(); 
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		//iterator
		System.out.println("-----------iterator-------------------");
		Iterator itr =l1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
