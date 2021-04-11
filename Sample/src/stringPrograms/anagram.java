package stringPrograms;

import java.util.Arrays;

public class anagram {
	
	public static void main(String[] args)
	{
		String x="silent";
		x=x.toLowerCase();
		String l="listen";
		l=l.toLowerCase();
		if(x.length()!=l.length())
		{
			System.out.println("Both strings are not anagram");
		}
		
		else
		{
			char ch[]=x.toCharArray();
			char ch1[]=l.toCharArray();
			Arrays.sort(ch);
			Arrays.sort(ch1);
			if(Arrays.equals(ch, ch1))
			{
				System.out.println("Both strings are anagram");
			}
			else
			{
				System.out.println("Not anagram");
			}
		}
	}

}
