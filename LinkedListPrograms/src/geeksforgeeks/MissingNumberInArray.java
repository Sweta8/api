package geeksforgeeks;

import java.util.Arrays;

public class MissingNumberInArray {
	
	public static void main(String[] args)
	{
		
		int a[]= {1,2,3,5};
		Arrays.sort(a);
		int n=a[a.length-1];
		int epectedsum=n*((n+1)/2);
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		int no=epectedsum-sum;
		System.out.println(no);
		
		
	}
	

}
