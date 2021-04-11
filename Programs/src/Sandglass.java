
public class Sandglass {
	
	public static void main(String[] args)
	{
		int i,j,k,star=5,space=0;
		int m,n,l,star1=3,space1=1;
		for(i=1;i<=3;i++)
		{
			for(j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			
			for(k=star;k>=1;k--)
			{
				System.out.print("*");
			}

			star=star-2;
			space=space+1;
			System.out.println();
		}
		
		for(m=1;m<=2;m++)
		{
			for(n=1;n<=space1;n++)
			{
				System.out.print(" ");
			}
			for(l=1;l<=star1;l++)
			{
				System.out.print("*");
			}
			star1=star1+2;
			space1=space1-1;
			System.out.println();
		}
		
	}

}
