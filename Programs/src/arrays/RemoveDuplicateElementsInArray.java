package arrays;

public class RemoveDuplicateElementsInArray {
	
	public static void main(String[] args)
	{
		int a[]= {10,30,40,50,50};
		int p=0;
		int i,j,k=0;
		for( i=0;i<a.length;i++)
		{
			k=1;
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					k++;
					a[j]=-1;
				}
			}
			
			if(!(a[i]!=-1&& k>1))
			{
				
				a[p++]=a[i];
			}
		}
		for(i=0;i<p;i++)
		{
			if(a[i]!=-1)
			{
			System.out.println(a[i]);
		}
	}
	}
}
