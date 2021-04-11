
public class LeftPascalTriangle {
	
	public static void main(String[] args)
	{
		int i,j,m,n;
		for(i=1;i<=2;i++)
		{
			System.out.print(" ");
			for(j=2;j>=1;j--)
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
		for(m=1;m<=3;m++)
		{
			for(n=1;n<=3;n++)
			{
				if(n>=m)
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
