package sample;

import java.util.*;

public class CharFrequencyHashMap {

	public static void main(String[] args) {
		String str="";
		ArrayList al =new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any string");
		str=sc.nextLine();
		int l=str.length();
		HashMap<Character, Integer> hm = new HashMap();
		for(int i=0;i<l;i++) {
			int count=countDups(str.charAt(i),str);
			hm.put((Character)str.charAt(i),(Integer)count);
		}
		System.out.println(hm);
		int i=0;
		for(Map.Entry<Character, Integer> entry:hm.entrySet()) {
			al.add(entry.getKey());
			System.out.println(entry.getKey()+"is repeated for "+entry.getValue()+" times");
		}
		System.out.println(al);
	}
	public static int countDups(char c, String str) {
		int count =0;
		char[] ch=str.toCharArray();
		for(char x:ch) {
			if(x==c)
				count++;
		}
		return count;
	}
}
