
public class PrimeNumber {
	
	public static void main(String[] args)
	{
		int a=10,n=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				n++;
			}
		}
		if(n==2)
		{
			System.out.println("Prime No");
		}
		else
		{
			System.out.println("Not prime");
		}
	}

}
