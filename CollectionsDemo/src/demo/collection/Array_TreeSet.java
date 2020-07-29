package demo.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Array_TreeSet {

	public static void main(String[] args) {
		Set list= new TreeSet();
		list.add("Peter");
		list.add("Jon");
		
		// Does not support  different data types as it can't sort different data types in ascending order at atimelist.add(2);
		list.add("Tom");
		list.add("Smith");
		System.out.println(list);
		// index based addition does not works in set list.add(2,"Bill");
		
		// Not able to add duplicate element
		list.add("Peter");
		
		//Output is in Ascending  order from what it was entered
		System.out.println(list);
		
		
		//Normal index based for loop does not work with sets 
		/*for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		*/
		System.out.println("--------------------------------------------------");
		
		//Using advanced for loop
		for(Object l:list) {
			System.out.println(l);
		}
		
		System.out.println("-----------------------------------------------");
		
		//Using Iterator
		Iterator it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());

	}
	}
}