package mycollections;

import java.util.*;

public class HashSetMethods {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("apple");
		hs.add(5.6);
		hs.add(7);
		hs.add('A');
		hs.add(true);
		hs.add(null);
		System.out.println(hs);
		Iterator it=hs.iterator();
		while(it.hasNext())
			System.out.println(" "+it.next());
		System.out.println(hs.contains('A'));
		System.out.println(hs.contains('C'));
		ArrayList al=new ArrayList();
		al.add('a');
		al.add('b');
		al.add('c');
		hs.addAll(al);
		System.out.println(hs);
		hs.removeAll(al);
		System.out.println(hs);
		hs.remove('A');
		System.out.println(hs);
		
	}

}
