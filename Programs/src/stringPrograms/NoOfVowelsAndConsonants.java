package stringPrograms;

public class NoOfVowelsAndConsonants {
	
	public static void main(String[] args)
	{
		String x="Sweta is singing";
		x=x.replace(" ", "");
		x=x.toLowerCase();
		int k=0;
		for(int i=0;i<x.length();i++)
		{
			char ch=x.charAt(i);
			if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
			{
				k++;
			}
				
			}
		System.out.println(k);
		System.out.println(x.length()-k);
		}
	}

