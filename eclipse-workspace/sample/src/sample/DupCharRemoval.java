package sample;
import java.util.*;

public class DupCharRemoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="geekforgeeks";
		Set s=new LinkedHashSet();
		char [] characters=new char[str.length()];
		characters=str.toCharArray();
		for (char ch: characters) {
			if(!s.contains(ch))
				s.add(ch);
		}
		System.out.println(s);
	}
}
