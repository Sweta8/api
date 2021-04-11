package arrays;

public class BinarySearch {



	public static void main(String[] args)
	{
	
		int a[]= {10,30,40,50,90};
		int i,j;
		int search=30;
		for( i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		int low=0,high=a.length-1;
		int mid;
		while(high>=low)
		{
			mid=(low+high)/2;
			if(a[mid]==search)
			{
				int pos=mid+1;
				System.out.println("Element found at position"+pos);
				break;
			}
			else if(a[mid]<search)
			{
				low=mid+1;
			}
			else if(a[mid]>search)
			{
				high=mid-1;
			}
		}
}
}