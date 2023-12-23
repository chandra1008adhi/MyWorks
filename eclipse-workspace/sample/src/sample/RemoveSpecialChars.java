package sample;

public class RemoveSpecialChars {

	public static void main(String[] args) {
		String str="asd.r@%uitj";
		String newstr="";
		char[] ch=str.toCharArray();
		for(char c:ch) {
			if(Character.isLetter(c)) {
				newstr=newstr+c;
			}
		}
		System.out.println(newstr);
	}

}
