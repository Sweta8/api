package stringPrograms;

public class subsetsOfString {
	
	public static void main(String[] args)
	{
		String x="FUN";
		for(int i=0;i<x.length();i++)
		{
			for(int j=i+1;j<=x.length();j++)
			{
				System.out.println(x.substring(i,j));
			}
		}
	}

}
