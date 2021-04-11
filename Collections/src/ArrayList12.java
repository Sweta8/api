public class ArrayList12 {
	
	public static void main(String[] args)
	{
		 
		int a[]= {1,3,5,7,9,11,15,17,19};
		int i,j;
		int n=3;
		int count=0;
		int m=0;
		if(a.length%n!=0)
		{
			System.out.println("Array cannot be divided into equal subset");
		}
		else
		{
			int p=a.length/n;
			int c=a.length;
			while(c>0)
			{
			for( i=0;i<i+p;i=i++)
			{
				a[count++]=a[i];
			}
			for(j=count-1;j>=count-p;j=j--)
			{
				a[m++]=a[j];
			}
			c-p;
		}
}
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
}
}