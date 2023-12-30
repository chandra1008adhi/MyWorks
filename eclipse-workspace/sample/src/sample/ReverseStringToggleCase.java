package sample;

public class ReverseStringToggleCase {

	public static void main(String[] args) {
		String input="Welcome to INFY";
		String output="";
		String [] words=input.split(" ");
		for(int i=words.length-1;i>=0;i--)
			output+=toggleCase(words[i])+" ";
		System.out.println(output);
	}
	public static String toggleCase(String s)
	{
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			if(Character.isUpperCase(s.charAt(i))) 
					s1+= Character.toLowerCase(s.charAt(i));
			else
				s1+=Character.toUpperCase(s.charAt(i));
		}
		return s1;			
	}

}
