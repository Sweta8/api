// Print fibonacci series for 8 length
public class Fibonacci {
	
	public static void main(String[] args)
	{
		int a=0,b=1,sum=0;
		System.out.print(a+" "+b);

		for(int i=1;i<6;i++)
		{
			sum=a+b;
			System.out.print(" "+sum);
			a=b;
			b=sum;
		}
		
	}

}
