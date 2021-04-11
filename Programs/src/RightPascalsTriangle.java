
public class RightPascalsTriangle {
	
	public static void main(String[] args)
	{
		int i,j;
		int m,n;
		for(i=1;i<=3;i++)
		{
			for(j=1;j<=3;j++)
			{
				if(i>=j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(m=1;m<=2;m++)
		{
			for(n=2;n>=1;n--)
			{
				if(m<=n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
