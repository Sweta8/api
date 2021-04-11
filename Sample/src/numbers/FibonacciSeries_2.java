package numbers;

public class FibonacciSeries_2 {
	
	public static void main(String[] args)
	{
		int no=7,a=0,b=1,sum=0;
		System.out.print(a+" "+b);
		while(sum<no)
		{
			sum=a+b;
			if(sum>=no)
			{
				break;
			}
			else
			{
			System.out.print(" "+sum);
			}
			a=b;
			b=sum;
		}
	}

}
