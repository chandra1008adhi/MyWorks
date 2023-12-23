package mycollections;

import java.util.HashSet;

public class SetMathMethods {

	public static void main(String[] args) {
		HashSet <Integer> s1=new HashSet<Integer>();
		s1.add(1);
		s1.add(2);
		s1.add(3);
		s1.add(4);
		s1.add(5);
		System.out.println(s1);
		HashSet <Integer> s2=new HashSet<Integer>();
		s2.add(3);
		s2.add(4);
		s2.add(5);
		System.out.println(s2);
		s1.addAll(s2);
		System.out.println(s1);
		
	}

}
