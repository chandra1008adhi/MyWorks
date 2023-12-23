package mycollections;
import java.util.*;
import java.util.Map.Entry;
public class HashMapMethods {

	public static void main(String[] args) {
		//HashMap hm=new HashMap();
		HashMap<Integer, String> hm =new <Integer, String> HashMap();
		hm.put(1, "apple");
		hm.put(2, "ball");
		hm.put(3,"cat");
		hm.put(4,"dog");
		hm.put(5, "egg");
		hm.put(6,"dog");
		System.out.println(hm);
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		Iterator it=hm.entrySet().iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		for(Entry entry:hm.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		for(Integer i:hm.keySet()) {
			System.out.println(i+"    "+hm.get(i));
		}
	}

}
