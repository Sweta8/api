import java.util.Scanner;

public class countDuplicateWordsInString {
	
	public static void main(String[] args)
	{
		String x;
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter string");
		x=scn.nextLine();
		x=x.toLowerCase();
		String a[]=x.split(" ");
		for(int i=0;i<a.length;i++)
		{
			int k=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].equals(a[j]))
				{
					k++;
					a[j]="0";
				}
			}
			if(k>1 && a[i]!="0")
				System.out.println(a[i]+" "+k);
		}

		
	}

}
