package sample;

import java.util.HashMap;
import java.util.Scanner;

public class CharFrequency {

	public static void main(String[] args) {
		String str="";
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		int count=0;
		HashMap<Character, Integer> map=new HashMap();
		char [] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
				}
			}
			map.put(ch[i], count);
			count=0;
		}
		System.out.println(map);
	}

}
