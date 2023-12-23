package sample;

import java.util.*;
import java.util.Map.Entry;

public class HashMapForLoop {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap();
		hm.put("abc",1);
		hm.put("pqr",3);
		hm.put("asd",3);
		hm.put("sample", 4);
		hm.put("qwerty",5);
		System.out.println(hm);
		for(String s:hm.keySet()) {
			System.out.println(s);
		}
		for(int i : hm.values()) {
			System.out.println(i);
		}
		for(Entry<String,Integer>entry:hm.entrySet())
		{
			System.out.println(entry.getKey()+" ---> "+ entry.getValue());
		}
	}
}