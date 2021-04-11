package geeksforgeeks;

import java.util.Arrays;

public class Missingnosbetween1and100 {
	
	public static void main(String[] args)
	{
		int a[]= {3 ,5, 8, 44};
		
		int j=0;
		
		for(int i=1;i<=100;i++)
		{
			if(j<a.length&&i==a[j])
			{
				j++;
			}
			else
			{
				System.out.println(i);
			}
		}
	}

}
