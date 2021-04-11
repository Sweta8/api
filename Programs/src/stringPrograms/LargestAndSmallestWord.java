package stringPrograms;

public class LargestAndSmallestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x="sweta is singing song";
		String ch[]=x.split(" ");
		int max=ch[0].length();
		int min=ch[0].length();
		String maxLengthElement="",minELement="";
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i].length()>max)
			{
				max=ch[i].length();
				 maxLengthElement=ch[i];
			}
			else if(ch[i].length()<min)
			{
				min=ch[i].length();
				 minELement=ch[i];
			}
		}
		
		System.out.println(maxLengthElement);
		System.out.println(minELement);

	}

}
