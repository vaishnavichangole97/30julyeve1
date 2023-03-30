package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList {
	
	public static void main(String[] args) {
		java.util.ArrayList al=new java.util.ArrayList();
		al.add("Rahul");
		al.add(100);
		al.add('A');
		al.add(65.5f);
		al.add(100);
		al.add(null);
		al.add(null);
		System.out.println(al);
		HashSet hs=new HashSet(al);
		System.out.println(hs);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.contains('A'));
		al.add(4,400);
		System.out.println(al);
		al.remove(4);
		System.out.println(al);
		al.set(3,75.5f);
		System.out.println(al);
		System.out.println(al.get(0));
		System.out.println("----print arrayList info using Iterator cursor----");
		Iterator itr = al.iterator();
		
		while(itr.hasNext())
		
		{
			
			System.out.println(itr.next());
		}
		
		System.out.println("----print arrayList info using ListIterator cursor----");
		ListIterator litr = al.listIterator();
		
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		System.out.println("----print arrayList info using foreach loop----");
		for(Object s1:al)
		{
			System.out.println(s1);
			
		}
		
		
		
	}

}
