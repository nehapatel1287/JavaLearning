package Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet myset= new HashSet();
		myset.add("hello");
		myset.add(100);
		myset.add(true);
		myset.add(null);
		myset.add(null);
		myset.add(100);
		
		System.out.println("......"+myset);
		
		// remove the element
		myset.remove(null);
		System.out.println("......"+myset);
		
		//Insert element is not allowed
		//Access specific element not possible
		
		//Convert HashSet --> arrayList
		ArrayList al=new ArrayList(myset);
		System.out.println(al);
		System.out.println("read index using array list"+al.get(2));
		
		//Read all the element using for..each
		
		for(Object x:myset) {
			System.out.println("........"+x);
		}
		
		// Clearing all the element
		
		myset.clear();
		
	}

}
