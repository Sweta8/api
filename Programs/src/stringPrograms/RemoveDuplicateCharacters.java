package stringPrograms;

public class RemoveDuplicateCharacters {
	
	public static void main(String[] args)
	{
		String x="sweta IS Eating";
		x=x.replace(" ", "");
		x=x.toLowerCase();
		char ch[]=x.toCharArray();
		for(int i=0;i<x.length();i++)
		{
			int k=1;
			for(int j=i+1;j<x.length();j++)
			{
				if(ch[i]==ch[j])
				{
					k++;
					ch[j]='\0';
				}
			}
			if((ch[i]!=0)&& k>1)
			{
				System.out.println(ch[i]+" "+k);
			}
		}
	}

}
