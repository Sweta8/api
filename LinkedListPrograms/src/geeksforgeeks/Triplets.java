package geeksforgeeks;

public class Triplets {
	
	public static void main(String[] args)
	{
		int a[]= {1,5,3,2,4};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				for(int k=j+1;k<a.length;k++)
				{
					
				if(a[i]==(a[j]+a[k]))
						{
					System.out.println("sum of "+a[i]+" is "+a[j]+" "+a[k]);
						}
			}
		}
	}

}
}
