package sample;

public class RemoveSpecialCharsRegex {

	public static void main(String[] args) {
		String str="asd.r@%uitj";
		str=str.replaceAll("[^A-Za-z0-9]","");
		System.out.println(str);
	}

}
