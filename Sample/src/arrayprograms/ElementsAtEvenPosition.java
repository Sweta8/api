package arrayprograms;

public class ElementsAtEvenPosition {
	
	public static void main(String[] args)
	{
		int a[]= {10,20,30,40,50};
		int i;
		for(i=0;i<a.length;i++)
		{
			if((i+1)%2==0)
			{
				System.out.println(a[i]);
			}
		}
	}

}
