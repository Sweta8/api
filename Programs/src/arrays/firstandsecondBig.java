package arrays;
public class firstandsecondBig {

	public static void main(String[] args)
	{
	
		int a[]= {10,20,30,40,60};
		int firstBig=a[0],secondBig=a[0];
		int firstBigPos=1,secondBigPos=1;
		int i;
		for(i=0;i<a.length;i++)
		{
			if(a[i]>firstBig)
			{
				secondBig=firstBig;
				firstBig=a[i];
				firstBigPos=i+1;
				
			}
			else if(a[i]>secondBig)
			{
				secondBig=a[i];
				secondBigPos=i+1;
			}
		}
		
		System.out.println(firstBig+" "+firstBigPos);
		System.out.println(secondBig+" "+secondBigPos);
}
}