package collection;

import java.util.Iterator;
import java.util.ListIterator;

public class LinkedList {
	public static void main(String[] args) {
		
		java.util.LinkedList ll=new java.util.LinkedList();
		ll.add("rahul");
		ll.add(100);
		ll.add(65.5f);
		ll.add('A');
		ll.add(100); 
		ll.add(null);
		ll.add(null);
				
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.isEmpty());    //false
		System.out.println(ll.get(1));
		System.out.println(ll.contains(100));     //true	
		
		System.out.println(ll);
		//add or insert data in between linkedlist
		ll.add(4, 500);
		System.out.println(ll);
		
		//remove or delete info in between Linkedlist
		ll.remove(4);
		System.out.println(ll);
		
		//update or modify info
		ll.set(0, "ganesh");
		System.out.println(ll);
		
		System.out.println("---print all data using Iterator cursor----");
		Iterator itr = ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---print all data using ListIterator cursor----");
	 ListIterator litr = ll.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("---print all data using for loop----");
		for(int i=0; i<=ll.size()-1; i++)
		{
			System.out.println(ll.get(i));
		}
		
		System.out.println("---print all data using foreach loop----");
		for(Object s1:ll) 
		{
			System.out.println(s1);
		}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
