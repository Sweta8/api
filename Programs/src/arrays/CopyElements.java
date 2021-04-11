package arrays;

public final class CopyElements {
	
	public static void main(String[] args)
	{
		int a[]= {10,20,30,40,50,90};
				int temp,i;
		for(i=0;i<a.length/2;i++)
		{
			temp=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=temp;
		}
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
