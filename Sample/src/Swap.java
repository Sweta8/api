
public class Swap {
	
	public static void main(String[] args)
	{
		
		
		int a=153;
		int y=a;
		int sum=0;
		while(a>0)
		{
			int d=a%10;
			sum=sum+d*d*d;
			a=a/10;
		}
		if(sum==y)
		{
			System.out.println("armstrong");
		}
	

	}

}
	
	


