package stringPrograms;

public class LargestAndSmallestPalindrome {
	
	public static void main(String[] args)
	{
		String x="mmadamm madam mmmadammm";
		String y[]=x.split(" ");
		String l="";
		int reverseLength=0,max=y[0].length(),min=y[0].length();
		String longest=y[0],smallest=y[0];
		for(int i=0;i<y.length;i++)
		{
			String z=y[i];
			
			for(int j=y[i].length()-1;j>=0;j--)
			{
				l=l+y[i].charAt(j);
			}
		
			if(z.equalsIgnoreCase(l))
			{
				reverseLength=l.length();
				if(max<reverseLength)
				{
					max=reverseLength;
					 longest=z;
				}
				else if(min>reverseLength)
				{
					min=reverseLength;
					smallest=z;
				}
			}
			l="";
		}
		System.out.println(longest);
		System.out.println(smallest);
	}

}
