package stringPrograms;

public class ReverseEachWordInAString {
	
	public static void main(String[] args)
	{
		String x="Sweta is singing";
		String y[]=x.split(" ");
		String x1="",z="";
		for(int i=0;i<y.length;i++)
		{
			for(int j=y[i].length()-1;j>=0;j--)
			{
				x1=x1+y[i].charAt(j);
				
			}
			
			z=z+x1+" ";
			x1="";
		}
		System.out.println(z);
	}

}
