package stringPrograms;

public class FrequencyOfCharactersInString {
	
	public static void main(String[] args)
	{
		String x="Sweta is singing";
		x=x.replace(" ", "");
		x=x.toLowerCase();
		char[] ch=x.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int k=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					k++;
					ch[j]='\0';
				}
			}
			if(ch[i]!='\0')
			{
				System.out.println(ch[i]+" "+k);
			}
		}
		
	}

}
