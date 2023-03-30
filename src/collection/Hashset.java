package collection;
	import java.util.HashSet;
	import java.util.Iterator;
	
	public class Hashset {
	
		public static void main(String[] args) 
		{
			HashSet hs=new HashSet();
			hs.add("rahul");
			hs.add(100);
			hs.add('A');
			hs.add(65.5f);
			hs.add(null);
			hs.add(100);
			hs.add(null);
			
			System.out.println(hs);
			System.out.println(hs.size());
			System.out.println(hs.contains(100));   //true
			System.out.println(hs.isEmpty());   //false
			
			hs.remove(100);
			System.out.println(hs);
			
		System.out.println("---print dada using iterator cursor-----");
		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---print dada using for each loop----");
		for(Object s1: hs)
		{
			System.out.println(s1);
		}
			
		}

}
