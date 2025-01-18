package Map_Interface;

import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		// treemap have natural sorting order
		// treemap follows sorting order.
		TreeMap t = new TreeMap();
		t.put(101, "sachin");
		t.put(103, "gopal");
		t.put(102, "sunil");
		t.put(107, "rohit");
		t.put(104, "atul");
		t.put(106, "manoj");

		System.out.println(t);

		// Returns the least key greater than or equal to the given key,
		// or null if there is no such key.
		// it return key and value
		System.out.println("ceilingEntry:==> " + t.ceilingEntry(105)); // ceilingEntry>=105 [given key]
		// it return only key but not return value
		System.out.println("ceilingKey:==> " + t.ceilingKey(105));
		System.out.println("ceilingEntry:==> " + t.ceilingEntry(108));// null

		// Returns the greatest key less than or equal to the given key,
		// or null if there is no such key.
		// FloorEntry () return the lower key or equal to given key
		System.out.println("floorKey:==> " + t.floorKey(105));
		System.out.println("floorEntry:==> " + t.floorEntry(105)); // floorEntry <=105

		// Returns the least key strictly greater than the given key,
		// or null if there is no such key.
		System.out.println("higher key:==> " + t.higherKey(106)); // return higherKey > given key...return only key
		System.out.println("higher Entry:==> " + t.higherEntry(101));// return higherEntry > given key...return
		// lowerKey() will return the lower key in a treemap.
		System.out.println("lower key:==> " + t.lowerKey(102));
		System.out.println("lower Entry:==> " + t.lowerEntry(103));// lowerEntry < given Entry

		// firstKey() will return the first key in a treemap.
		System.out.println("firstKey:==> " + t.firstKey());
		System.out.println("firstEntry:==> " + t.firstEntry());
		// lasttKey() will return the last key in a treemap.
		System.out.println("lastKey:==> " + t.lastKey());
		System.out.println("lastEntry:==> " + t.lastEntry());

		// a view of the portion of this map whose keys are strictly less than toKey
		// Printing the entries before id-104 in ascending order (id-104 will be excluded)
		System.out.println("headMap:==> " + t.headMap(104)); // headMap < givenkey
		
		//a view of the portion of this map whose keys are greaterthan or equal to fromKey
		// Printing the entries from id-3 till the end in ascending order
		System.out.println("tailMap:==> "+t.tailMap(104)); //tailMap >=given key
		
		// Printing the entries from id-103 to id-106 in ascending order (id-106 will be excluded)
		System.out.println("subMap:==> "+t.subMap(103, 106));

		// Printing the employee using id-104
		System.out.println("get:==> " + t.get(104));
		// Printing all the keys
		System.out.println("Keyset:==> " + t.keySet());
		// Printing all the values
		System.out.println("values:==> " + t.values());
		
		//remove first entry from map
		System.out.println("pollFirstEntry:==> "+t.pollFirstEntry());
		System.out.println(t);
		//remove last entry from map
		System.out.println("pollLastEntry:==> "+t.pollLastEntry());
		System.out.println(t);

	}

}
