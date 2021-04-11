import java.util.Scanner;

public class Prime {
	
	public static void main(String[] args)
	{
		int no,i,k=0;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		no=scn.nextInt();
		for(i=1;i<=no;i++)
		{
			if(no%i==0)
			{
				k++;
			}
		}
		if(k==2)
		{
			System.out.println("prime no");
		}
		else
		{
			System.out.println("not prime no");
		}
		
	}

}
