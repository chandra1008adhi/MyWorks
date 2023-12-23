package sample;

public class FirstDupCharNotPossibleMethods {
	public static void main(String [] args) {
		String str="absdfabfdsa";
		String sstr="";
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					sstr=sstr+ch[i];
					break;
				}
			}
		}
		System.out.println(sstr);
		System.out.println("First Dup Char "+sstr.charAt(0));
	}

}
