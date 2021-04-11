import java.util.Scanner;

public class FiboanacciSeries {

	public static void main(String[] args)
	{
		int no,a=0,b=1,sum=0;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter no");
		no=scn.nextInt();
		
		while(sum<=no)
		{
			
			System.out.println(sum);
			sum=a+b;
			a=b;
			b=sum;
		}

	}
}
