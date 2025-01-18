package Map_Interface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {
	
	//hashmap does not follows insertion and sorting order.
	//hashmap store the data in key-value-pair
	//each key-value-pair is known as entry
	//in hashMap key should be unique but values can be duplicate.
	//in HashMap we can store only one null value in key
	//but we can store multiple null values in value.

	public static void main(String[] args) {
		//<Integer,String>
		HashMap h=new HashMap();
		
		h.put(101, "sachin");
		h.put(102, "gopal");
		h.put(103, "sunil");
		h.put(104, "rohit");
		h.put(105, "kiran");
		h.put(null, "null");
		h.put(111, null);
		h.put(222, null);
		
		//output in the form of map{}
				System.out.println(h);
		
		//methods
		
		//System.out.println(h.clone());
		System.out.println("get:=> "+h.get(104));
		System.out.println("contains key:=>"+h.containsKey(111));
		System.out.println("contains value:=>"+h.containsValue("sachin"));
		System.out.println("check size:=> "+h.size());
		System.out.println(h.isEmpty());
		System.out.println("remove with key:=>"+h.remove(101));
		System.out.println("remove with key nd value:=>"+h.remove(222, null));
		System.out.println("replace:=>"+h.replace(104, "rohit", "raut"));
		System.out.println(h);
		
		
		
		//retrive data one by one using for each loop
//		
//		for(Map.Entry m:h.entrySet())
//		{
//			System.out.println(m.getKey()+"  :=> "+m.getValue());
//		}
		//set form[]
		Set set = h.entrySet();
		System.out.println(set);
		
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			//System.out.println(itr.next());
			Map.Entry entry = (Entry) itr.next();
			System.out.println(entry.getKey()+"->"+entry.getValue());
		}

	}

}
