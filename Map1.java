package Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class Map1 {

	public static void main(String[] args) {
		//map store the data in key-value-pair
		//map does not follows insertion and sorting order
		//in map keys should be unique but values can store Duplicate values
		Map m=new HashMap();
		m.put(1, "sachin");
		m.put(2, "gopal");
		m.put(3, "sunil");
		m.put(4, "rohit");
		m.put(5, "atul");
		m.put(null, null);//in map we can store maximum only one null value.
		m.put(7,null );//and we can store multiple null value in value.
		
		System.out.println(m);
		System.out.println("entry:=>"+m.entrySet());//return in set[]
		
		//m.clear();
		System.out.println(m.size());
		
		System.out.println(m.get(4));
		System.out.println(m.containsKey(5));//key
		System.out.println(m.containsValue("gopal"));//value
		System.out.println(m.remove(5));
		System.out.println(m.replace(4, "satyam"));
		System.out.println(m);
	    System.out.println(	m.hashCode());
		System.out.println(m.isEmpty());
		

	}

}
