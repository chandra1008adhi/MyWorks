package mycollections;
import java.util.*;
public class QueueDemo {

	public static void main(String[] args) {
		PriorityQueue <Integer> q = new PriorityQueue<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.offer(3);
		System.out.println(q);
		//q.add('a');
		//q.offer('a');
		System.out.println(q.element());
		System.out.println(q.peek());
		System.out.println(q);
		Iterator <Integer> it=q.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println(q.remove());
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		
	}

}
