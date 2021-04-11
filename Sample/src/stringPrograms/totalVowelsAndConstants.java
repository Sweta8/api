package stringPrograms;

public class totalVowelsAndConstants {
	
	public static void main(String[] args)
	{
		String x="My name is sweta nnig";
		x=x.replace(" ", "");
		x=x.toLowerCase();
		int k=0,c1=0;
		char c=' ';
		for(int i=0;i<x.length();i++)
		{
			c=x.charAt(i);
			if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
			{
				k++;
			}
			else
			{
				if(c>='a'&&c<='z')
				{
					c1++;
				}
			}
		}
		System.out.println("Vowel is "+k);
		System.out.println("consonant is "+c1);
	}

}
