package stringPrograms;

public class StringRotationOfAnotherString {
	
	public static void main(String[] args)
	{
		String x="abcde";
		String y="deabc";
		
		
		if(x.length()!=y.length())
		{
			System.out.println("String is not rotation of another");
		}
		else
		{
			x=x+x;
			System.out.println(x);
			if(x.indexOf(y)!=-1)
			{
				System.out.println("Second string is rotation of another");
			}
			else
			{
				System.out.println("Not roatation");
			}
		}
	}

}
