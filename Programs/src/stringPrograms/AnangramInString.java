package stringPrograms;

public class AnangramInString {
	
	public static void main(String[] args)
	{
		String x="silent";
		String y="listen";
		x=x.toLowerCase();
		y=y.toLowerCase();
		char temp='\0';
		char temp1='\0';
		if(x.length()!=y.length())
		{
			System.out.println("Both strings are not anagram");
		}
		else
		{
			char ch[]=x.toCharArray();
			char ch1[]=y.toCharArray();
			for(int i=0;i<ch.length-1;i++)
			{
				for(int j=0;j<ch.length-1-i;j++)
				{
					if(ch[j]>ch[j+1])
					{
						temp=ch[j];
						ch[j]=ch[j+1];
						ch[j+1]=temp;
					}
					if(ch1[j]>ch1[j+1])
					{
						temp1=ch1[j];
						ch1[j]=ch1[j+1];
						ch1[j+1]=temp1;
					}
				}
			}
			
			String m=ch.toString();
			String n=ch.toString();
			if(m.equalsIgnoreCase(n))
			{
				System.out.println("anangram");
			}
			else
			{
				System.out.println("Not anangram");
			}
			
		}
	}

}
