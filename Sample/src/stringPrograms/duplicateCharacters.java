package stringPrograms;

public class duplicateCharacters {
	
	public static void main(String[] args)
	{
		String x="My name is sweta";
		x=x.toLowerCase();
		x=x.replace(' ', '\0');
		char c[]=x.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			int k=1;
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					k++;
					c[j]='\0';
				}
			}
			if(c[i]!='\0'&& k>1)
			{
				System.out.println(c[i]);
			}
		}
	}

}
