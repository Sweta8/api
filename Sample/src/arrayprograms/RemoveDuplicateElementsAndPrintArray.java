package arrayprograms;

import java.util.Arrays;

public class RemoveDuplicateElementsAndPrintArray {
	
	public static void main(String[] args)
	{
		
			int a[]= {1, 2, 2, 3, 4, 4, 4, 5, 5,10,10,14,56,43,43,2};
			Arrays.sort(a);
			int j=0;
			for(int i=0;i<a.length-1;i++)
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
