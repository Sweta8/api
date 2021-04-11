package stringPrograms;

public class noOfCharacters {
	
	public static void main(String[] args)
	{
		String a="My name is    sweta";
		char c;
		String s=" ";
		int k=0;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)!=' ')
			{
				s=s+a.charAt(i);
				k++;
			}
		}
		System.out.println(k);
	}

}
