package sample;

import java.util.HashMap;

public class FirstDupChar {
	public static void main(String [] args) {
		String str="absdfabfdsa";
		char[] ch=str.toCharArray();
		HashMap <Character, Integer> hm=new HashMap();
		for(char c: ch) {
			if(hm.containsKey(c)) {
				System.out.println("Dup char is "+c);
				break;
			}
			else
				hm.put(c,1);
					
			}
		}
		
	}
