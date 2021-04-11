
public class Armstrong {
	
	public static void main(String[] args)
	{
		int a=153,d,s,sum=0;
		s=a;
		while(a>0)
		{
			d=a%10;
			sum=sum+d*d*d;
			a=a/10;
		}
		if(sum==s)
		{
			System.out.println("Armstrong no");
		}
		else
		{
			System.out.println("Not Armstrong no");
		}
	}

}
