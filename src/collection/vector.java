package collection;


import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vector {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("rahul");
		v.add(100);
		v.add('A');
		v.add(65.5f);
		v.add(100);
		v.add(null);
		v.add(null);
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		System.out.println(v.contains('A'));
		System.out.println(v);
		v.add(4,400);
		System.out.println(v);

		v.remove(4);
		System.out.println(v);

		v.set(4, 400);
		System.out.println(v);
		System.out.println(v.get(0));
		System.out.println("----print arrayList info using Iterator cursor----");
		Iterator itr = v.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		System.out.println("----print arrayList info using ListIterator cursor----");
		ListIterator litr = v.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
			
		}
		System.out.println("----print arrayList info using enumeration cursor----");
		Enumeration enu = v.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		
		
		
		
		
	}

}
