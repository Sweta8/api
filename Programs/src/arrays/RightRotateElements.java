package arrays;

public class RightRotateElements {
	
	public static void main(String[] args)
	{
		int a[]= {10,30,4,70};
		int n=2,last=0,i;
		for( i=1;i<=n;i++)
		{
			last=a[a.length-1];
			for(int j=a.length-2;j>=0;j--)
			{
				a[j+1]=a[j];
			}
			a[0]=last;
		}
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
