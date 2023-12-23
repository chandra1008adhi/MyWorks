package sample;

import java.util.HashMap;
import java.util.Map.Entry;

public class MostFrequentCharHashMap {

	public static void main(String[] args) {
		String str="geekforgeeks";
		int count=0;
		HashMap<Character,Integer> hm=new HashMap <Character,Integer>();
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					count++;
				}
			}
			hm.put(str.charAt(i),count);
			count=0;
		}
		System.out.println(hm);
		Entry<Character, Integer> maxpair=null;
		for(Entry<Character, Integer> entry:hm.entrySet())
		{
			
			if(maxpair==null||entry.getValue().compareTo(maxpair.getValue())>0) {
				maxpair=entry;
			}
		}
		System.out.println("Most Occured char is "+maxpair.getKey()+" for "+maxpair.getValue()+" times");
	}

}