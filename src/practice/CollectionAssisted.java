package practice;

import java.util.*;

public class CollectionAssisted {
	public static void main(String[] args) {
		//creating arraylist
		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();   
		city.add("Ongole");//
		city.add("Kadapa");
		city.add("Nellore");
		System.out.println(city);  
				
		//creating vector
		System.out.println();
		System.out.println("Vector");
		Vector<Integer> vec = new Vector();
		vec.addElement(15); 
		vec.addElement(40); 
		System.out.println(vec);
				
		//creating Linkedlist
		System.out.println();
		System.out.println("LinkedList");
		java.util.LinkedList<String> names = new java.util.LinkedList<String>();    
		names.add("Prem");  
		names.add("Sree");
		names.add("Mahesh");
		Iterator<String> itr=names.iterator();
		while(itr.hasNext()){  
			System.out.println(itr.next());  
			       
			//creating hashset
			System.out.println("\n");
			System.out.println("HashSet");
			HashSet<Integer> set=new HashSet<Integer>();  
			set.add(19);  
			set.add(5);  
			set.add(78);
			set.add(7);
			System.out.println(set);
			       
			//creating linkedhashset
			System.out.println("\n");
			System.out.println("LinkedHashSet");
			LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
			set2.add(15);  
			set2.add(17);  
			set2.add(19);
			set2.add(21);	       
			System.out.println(set2);
		} 
	}
}