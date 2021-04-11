package stringPrograms;

import java.util.Arrays;

public class StringsAreAnagram_usinginbuiltfunctions {
	
	public static void main(String[] args)
	{
		String x="silent";
		x=x.toLowerCase();
		String y="Listen";
		y=y.toLowerCase();
		
		if(x.length()!=y.length())
		{
			System.out.println("Both strings are not anangram");
		}
		else
		{
			char ch[]=x.toCharArray();
			char ch1[]=y.toCharArray();
			Arrays.sort(ch);
			Arrays.sort(ch1);
			
			if(Arrays.equals(ch, ch1)==true)
			{
				System.out.println("Both are anagram");
			}
			else
			{
				System.out.println("Not anagram");
			}
		}
	}

}
