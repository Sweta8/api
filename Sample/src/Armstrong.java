import java.util.Scanner;

public class Armstrong {
	
	public static void main(String[] args)
	{
		int a,sum=0, d=0,k;
		Scanner scn=new Scanner(System.in);
		System.out.println("enter no");
		a=scn.nextInt();
		k=a;
		while(a>0)
		{
			d=a%10;
			sum=sum+d*d*d;
			a=a/10;
		}
		if(sum==k)
		{
			System.out.println("armstrong no");
		}
		else
		{
			System.out.println("not armstrong no");
		}
	}

}
