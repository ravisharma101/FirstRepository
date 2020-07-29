package demo.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Array_List {
	//Ravi The Great

	public static void main(String[] args) {
		List list= new ArrayList();
		list.add("Peter");
		list.add("Jon");
		list.add(2);
		list.add("Tom");
		list.add("Smith");
		System.out.println(list);
		list.add(2,"Bill");
		
		//Add duplicate element
		list.add("Peter");
		
		//Output is in same order as it was entered
		System.out.println(list);
		
		System.out.println("---------------------------------------------");
		
		//Using normal for loop
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
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
