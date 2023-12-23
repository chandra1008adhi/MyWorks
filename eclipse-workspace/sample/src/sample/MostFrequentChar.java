package sample;

public class MostFrequentChar {

	public static void main(String[] args) {
		String str="aeabbebcecddeddee";
		int [] freq= new int[str.length()];
		char maxChar=' ';
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					freq[i]++;
				}
			}
		}
		int max=freq[0];
		for(int i=1;i<freq.length;i++)
		{
			if(freq[i]>max)
			{
				max=freq[i];
				maxChar=str.charAt(i);
			}
		}
		System.out.println("most occurred char is "+maxChar);
		
	}

}