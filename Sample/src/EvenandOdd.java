import java.util.Scanner;

public class EvenandOdd {
	
	public static void main(String[] args)
	{
		int a,k=0,i=1;
		Scanner scn=new Scanner(System.in);
		System.out.println("enter no");
		a=scn.nextInt();
		while(i<=a)
		{
			if(a%i==0)
			{
				k++;
			}
			i++;
		}

		if(k==2)
		{
			System.out.println("odd");
		}
		else
		{
			System.out.println("even");
		}
		
	}

}
