package mycollections;

import java.util.*;

public class LinkedListMethods {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add("apple");
		ll.add(3);
		ll.add(5.6);
		ll.add('a');
		ll.add(false);
		ll.add(null);
		System.out.println(ll);
		ll.add(3,"python");
		System.out.println(ll);
		ll.remove("python");
		System.out.println(ll);
		ll.remove(2);
		System.out.println(ll);
		System.out.println(ll.indexOf(null));
		ll.set(ll.indexOf(null), "c#");
		System.out.println(ll);
		Iterator it=ll.iterator();
		while(it.hasNext())
			System.out.print("  "+it.next());
		System.out.println();
		ll.addFirst("sample");
		System.out.println(ll);
		ll.addLast(34);
		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		ll.removeFirst();
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
		System.out.println(ll.contains("c#"));
		System.out.println(ll.contains("c++"));
	} 

}
