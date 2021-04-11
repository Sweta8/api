import java.util.Scanner;

public class counteachCharacterInAString {
	
	public static void main(String[] args)
	{
		String x;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter string");
		x=scn.nextLine();
		x=x.toLowerCase();
		
		char ch[]=x.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int k=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					k++;
					
					ch[j]='\0';
				}
			}
			if(k>=1&&ch[i]!=' ')
			System.out.println(ch[i]+" "+k);
		}
		}
		
	}

