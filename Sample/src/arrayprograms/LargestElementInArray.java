package arrayprograms;

public class LargestElementInArray {
	
	public static void main(String[] args)
	{
		int a[]= {10,20,50,60,50};
		int temp,i,j;
		for( i=0;i<a.length-1;i++)
		{
			for( j=0;j<a.length-1-i;j++)
			{
				if(a[j]<a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		int c=0;
		int t[]=new int[a.length];
		for(i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				a[c++]=a[i];
		}
		}
		a[c++]=a[a.length-1];
		for(int k=0;k<c;k++)
			System.out.println(a[k]);
		
}
}
