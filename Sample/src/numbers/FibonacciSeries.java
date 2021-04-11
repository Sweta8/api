package numbers;

public class FibonacciSeries {
	
	public static void main(String[] args)
	{
		int no=7,i,a=0,b=1,sum=0;
		System.out.print(a+" "+b);
		for( i=0;i<no-2;i++)
		{
			sum=a+b;
			System.out.print(" "+sum);
			a=b;
			b=sum;
		}
	}

}
