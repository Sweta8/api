
public class Mirrored_RightAngledTriangle {
	
	public static void main(String[] args)
	{
		int i,j;
		for(i=1;i<=3;i++)
		{
			for(j=3;j>=1;j--)
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
	}
	

}
