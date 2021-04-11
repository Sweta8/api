package arrayprograms;

public class PrintElementsAtOddPositions {
	
	public static void main(String[] args)
	{
		int i;
		int no[]= {10,20,30,40,50};
		for(i=0;i<no.length;i++)
		{
			if(((i+1)%2)!=0)
			{
				System.out.println(no[i]);
			}
		}
	}

}
