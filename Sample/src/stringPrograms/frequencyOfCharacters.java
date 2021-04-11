package stringPrograms;

public class frequencyOfCharacters {
	
	public static void main(String[] args)
	{
		String a="My name is sweta";
		a=a.toLowerCase();
		a=a.replace(' ', '\0');
		char m[]=a.toCharArray();
		for(int i=0;i<m.length;i++)
		{
			int k=1;
			for(int j=i+1;j<m.length;j++)
			{
				if(m[i]==m[j])
				{
					k++;
					m[j]='\0';
					
				}
			}
			if(m[i]!='\0')
			{
				System.out.println(m[i]+" "+k);
			}
		}
	}

}
