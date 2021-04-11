package arrays;

public class LeftRotateElements {
	
	public static void main(String[] args)
	{
		
	int n=3,i,j,first;
	int a[]= {10,20,50,90,90,80,70,80,60,60};
	
	for(i=0;i<n;i++)
	{
		first=a[0];
		for(j=0;j<a.length-1;j++)
		{
			a[j]=a[j+1];
		}
		a[j]=first;
	}
	for(i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	}

}
