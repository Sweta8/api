import java.util.Scanner;

public class ReverseNo {

	
	public static void main(String[] args)
	{
		int a,rev=0,d,s;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter no");
		a=scn.nextInt();
		s=a;
		while(a>0)
		{
			d=a%10;
			rev=(rev*10)+d;
			a=a/10;
		}
		if(rev==s)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}
}
