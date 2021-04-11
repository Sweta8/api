package stringPrograms;

public class punctuationCharactersInString {
	
	public static void main(String[] args)
	{
		String x="My name? is sweta???";
		int k=0;
		for(int i=0;i<x.length();i++)
		{
			if(x.charAt(i)=='?')
			{
				k++;
			}
		}
		System.out.println(k);
	}

}
