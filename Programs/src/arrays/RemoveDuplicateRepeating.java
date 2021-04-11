package arrays;

import java.util.Arrays;

public class RemoveDuplicateRepeating {
	
	public static void main(String[] args)
	{
		int a[]= {10,30,40,50,30,80,30,80};
		int i,j=0;
		Arrays.sort(a);
		for(i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				a[j++]=a[i];
			}
		}
		a[j++]=a[a.length-1];
		for(int k=0;k<j;k++)
		{
			System.out.println(a[k]);
		}
	}

}
