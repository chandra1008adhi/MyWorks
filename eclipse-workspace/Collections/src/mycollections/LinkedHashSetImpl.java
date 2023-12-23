package mycollections;
import java.util.*;
public class LinkedHashSetImpl {

	public static void main(String[] args) {
		LinkedHashSet lsh=new LinkedHashSet();
		HashSet hs=new HashSet();
		TreeSet ts=new TreeSet();
		lsh.add(1);
		lsh.add(4);
		lsh.add(3);
		lsh.add(5);
		lsh.add(2);
		System.out.println(lsh);
		hs.add(1);
		hs.add(4);
		hs.add(5);
		hs.add(2);
		hs.add(3);
		hs.add(6);
		System.out.println(hs);
		ts.add(1);
		ts.add(4);
		ts.add(3);
		ts.add(5);
		ts.add(2);
		System.out.println(ts);
	}
}
