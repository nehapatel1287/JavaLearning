package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDeclartion{

	public static void main(String[] args) {
		//Declaration of the ArrayList
		
		ArrayList myList=new ArrayList();
		//List MyList= new ArrayList();
		//ArrayLisy<Interger> myList=new ArrayList<Interger>();
		// ArrayList<Employee> myList= new ArrayList<Employee>();
		
		//Adding data into arraylist
		
		myList.add(100);
		myList.add("welcome");
		myList.add(null);
		myList.add(true);
		
		//Size of ArrayList
		System.out.println(myList.size());
		System.out.println(myList);
		
		//Remove element
		myList.remove(2);
		System.out.println(myList);
		
		//Insert the element in the index, rest all values will be shifted to next index
		
		myList.add(2,"added");
		System.out.println(myList);
		
		//Modification of the arraylist(replacement/change the value)
		
		myList.set(2,"newValue");
		System.out.println(myList);
		
		//Access Specific element from arraylist
		myList.get(3);
		System.out.println(myList);
		
		//Reading all the element from the arraylist
		
			//Using for loop
		System.out.println("for Loop............");
		for(int i=0;i<myList.size();i++) {
			
			System.out.println(myList.get(i));
		}
			//Using for.each loop
		System.out.println("ForEach............");
		for(Object x: myList) {
			
			System.out.println(x);
			
		}
			
			//Using iterator (always use while loop), if we will not using while loop with hasNext() method , will get online first value
		Iterator <Object>it=myList.iterator();
		System.out.println("Itrateor............");
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
			
			//Checking arraylist is empty or not
		System.out.println(myList.isEmpty());
		
			//Remove all the value from the array list
		ArrayList mylist= new ArrayList();
		System.out.println("remove multipal element.........,,,");
		mylist.add(100);
		mylist.add(true);
		
		System.out.println(myList.removeAll(mylist));
		
		//Clear the list
		mylist.clear();
		System.out.println(mylist);
		
	}

}
