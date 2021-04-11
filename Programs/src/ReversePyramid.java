
public class ReversePyramid {
	
	public static void main(String[] args)
	{
		int i,j,k,space=0,star=5;
		
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
	}

}
