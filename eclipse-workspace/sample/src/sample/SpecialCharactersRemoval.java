package sample;

public class SpecialCharactersRemoval {
	public static void main(String[] a) {
		String str="!#$GeeeksforGeeks.Computer.Science.Portal!!";
		String newStr="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isLetter(ch)==true) {
				newStr=newStr+ch;
			}
		}
		System.out.println(newStr);
	}
}
