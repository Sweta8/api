
public class FibonacciSeries_UptoNumber {
	
	public static void main(String[] args)
	{
		int a=0,b=1,sum=0;
		System.out.print(a+" "+b);
		
		while(sum<=10)
		{
			sum=a+b;
			System.out.print(" "+sum);
			a=b;b=sum;
			if(a+b>10)
				
				break;
		}
	}

}
