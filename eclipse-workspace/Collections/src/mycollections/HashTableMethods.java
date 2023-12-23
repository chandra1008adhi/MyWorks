package mycollections;
import java.util.*;
import java.util.Map.*;
public class HashTableMethods {

	public static void main(String[] args) {
		Hashtable <Character, Integer>ht = new <Character, Integer>Hashtable();
		ht.put('a',1);
		ht.put('b',2);
		ht.put('c',3);
		ht.put('d',4);
		ht.put('e',5);
		ht.put('f',6);
		System.out.println(ht);
		Entry<Character, Integer> maxpair=null;
		for(Entry <Character, Integer>entry:ht.entrySet()) {
			if(maxpair==null||entry.getValue().compareTo(maxpair.getValue())>0)
				maxpair=entry;
		}
		System.out.println(maxpair);
	}

}
