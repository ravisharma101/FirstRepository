package demo.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Array_Set {

	public static void main(String[] args) {
		Set list= new HashSet();
		list.add("Peter");
		list.add("Jon");
		list.add(2);
		list.add("Tom");
		list.add("Smith");
		System.out.println(list);
		// index based addition does not works in set list.add(2,"Bill");
		
		// Not able to add duplicate element
		list.add("Peter");
		
		//Output is in random  order from what it was entered
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
