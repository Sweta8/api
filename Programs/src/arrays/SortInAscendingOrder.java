package arrays;

public class SortInAscendingOrder {
	
	public static void main(String[] args)
	{
		int a[]= {10,5,6,30,60};
		int temp;
		int i;
		for( i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
