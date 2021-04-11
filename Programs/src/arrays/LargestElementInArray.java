package arrays;

public class LargestElementInArray {
	
	public static void main(String[] args)
	{
		int a[]= {10,1,40,60,6,5};
		int max=a[0];
		int post=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				 post=i+1;
			}
		}
		System.out.println(max+" "+post);
	}

}
