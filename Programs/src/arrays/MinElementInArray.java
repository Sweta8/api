package arrays;

public class MinElementInArray {
	
	public static void main(String[] args)
	{
		int a[]= {10,3,5,0,70};
		int min=a[0],i,p=0;
		for(i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
				p=i+1;
			}
		}
		System.out.println(min+" "+p);
	}

}
