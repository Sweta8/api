import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args)
	{
		int a,f=1,i,sum=1;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter no");
		a=scn.nextInt();
		for(i=1;i<=a;i++)
		{
			sum=sum*i;
		}
		
		System.out.println(sum);
	}

}
