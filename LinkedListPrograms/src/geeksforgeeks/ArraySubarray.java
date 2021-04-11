package geeksforgeeks;

public class ArraySubarray {
	
	public static void main(String[] args)
	{
		int a[]= {2,4,5,7,6,6,3,9};
		int sum=12;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(sum==(a[i]+a[j]))
				{
					System.out.println(a[i]+" "+a[j]);
					int positionFirst=i+1;
					int nextPostion=j+1;
					System.out.println(positionFirst+" "+nextPostion);
				}
			}
			
		}
	}

}
