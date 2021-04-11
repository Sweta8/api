package arrays;

public class SumOfItemsInArray {
	
	public static void main(String[] args)
	{
		int a[]= {80,50,40,30};
		int sum=0,i;
		for(i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}

}
