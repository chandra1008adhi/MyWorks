package mycollections;
import java.util.*;
public class ArrayListMethods {
	public static void main(String [] args)
	{
		ArrayList al= new ArrayList();
		al.add(100);
		al.add("welcome");
		al.add(5.6);
		al.add('a');
		al.add(true);
		System.out.println(al);
		System.out.println(al.get(2));
		al.set(1, "python");
		System.out.println(al);
		System.out.println(al.indexOf("python"));
		al.set(al.indexOf("python"), "java");
		System.out.println(al);
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		for(Object e:al) {
			System.out.println(e);
		}
		Iterator it=al.iterator();
		while(it.hasNext())
			System.out.print("  "+it.next());
		ArrayList <String> als=new ArrayList <String> ();
		als.add("apple");
		als.add("ball");
		als.add("cat");
		als.add("god");
		System.out.println();
		System.out.print(als);
		System.out.println();
		al.add(als);
		System.out.print(al);
		System.out.println();
		al.removeAll(als);
		System.out.print(al);
		System.out.println();
		String sam[]= {"dog","cat","apple","java"};
		ArrayList alp=new ArrayList(Arrays.asList(sam));
		al.removeAll(alp);
		System.out.print(alp);
		System.out.println();
		System.out.print(al);
		Object[] o=al.toArray();
		for(Object e:o)
			System.out.println(e);
		for(int i=0;i<al.size();i++)
			System.out.println(al.get(i));
		ArrayList alp_dup = new ArrayList();
		alp_dup.addAll(alp);
		System.out.println("alp_dup= "+alp_dup);
		alp_dup.add(null);
		System.out.println("alp_dup= "+alp_dup);
		System.out.println("------------------ Sorting ---------------");
		//Collections.sort(al); type is must sorting to be invoked on homogeneous list
		System.out.println(al);
		
	}

}
