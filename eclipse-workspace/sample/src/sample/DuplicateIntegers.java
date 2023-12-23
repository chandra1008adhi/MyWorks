package sample;

import java.util.Set;
import java.util.LinkedHashSet;

public class DuplicateIntegers {
	public static void main(String [] args) {
		int[] a= {1,2,3,4,5,3,5,7,8};
		Set <Integer> s=new LinkedHashSet();
		for(int x: a) {
			if(!s.add(x))
				System.out.println(x+" is a duplicate element");
		}
		System.out.println(s);
	}
	
}
