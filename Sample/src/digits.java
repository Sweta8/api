import java.util.Scanner;

public class digits {
	
	public static void main(String[] args)
	{
		int a,d=0;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter no");
		a=scn.nextInt();
		if(a<0)
		{
			a=a*-1;
		}
		else if(a==0)
		{
			a=1;
		}
		
		while(a>0)
		{
			a=a/10;
			d=d+1;
		}
		System.out.println(d);
	}

}
