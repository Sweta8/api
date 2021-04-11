import java.util.Scanner;

public class removeDuplicateCharcaters {
	public static void main(String[] args)
	{
		String x;
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter string");
		x=scn.nextLine();
		x=x.toLowerCase();
		char c[]=x.toCharArray();
		for(int i=0;i<x.length();i++)
		{
			int k=0;
			for(int j=i+1;j<x.length();j++)
			{
				if(c[i]==c[j])
				{
					k++;
					c[j]='0';
					break;
				}
			}
			if(k>0)
			{
				System.out.println(c[i]);
			}
		}
	}

}
