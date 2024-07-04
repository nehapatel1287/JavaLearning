package HashMapDemotest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		
		//Adding Pairs
		
		hm.put(100, "John");
		hm.put(102, "Scott");
		hm.put(103, "Mary");
		
		System.out.println("List of data"+hm);
		
		//Size of hashmap
		System.out.println("Size of the hash map"+hm.size());
		
		//Remove pair
		
		hm.remove(103);
		System.out.println(hm);
		
		//access value of the key
		System.out.println(hm.get(102));
		
		//get all the key from the hashmap
		System.out.println("Key Set"+hm.keySet());
		
		//
		
		System.out.println("All the Values"+hm.values());
		
		System.out.println("get the data in the form of set or arry"+hm.entrySet());
		
		// Read the data from hashmap
		
		//Using for each
		
		for(int k:hm.keySet()) {
			System.out.println(k +"  "+ hm.keySet());
			
		}

		// Using Iterator
		
		Iterator<Entry<Integer, String>> it= hm.entrySet().iterator();
		
		while(it.hasNext()) {
			Entry<Integer, String> entry= it.next();
			System.out.println(entry.getKey() +"   "+entry.getValue());
			
		}
	}

}
