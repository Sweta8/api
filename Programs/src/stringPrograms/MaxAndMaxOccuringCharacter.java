package stringPrograms;

public class MaxAndMaxOccuringCharacter {
	
	public static void main(String[] args)
	{
		String x="sweta is Singiing";
		x=x.toLowerCase();
		x=x.replace(" ", "");
		int k,l=0,m=0;
		char y[]=x.toCharArray();
		 char[] ch = new char[y.length];
		 int count[]=new int[y.length];
		System.out.println(y);
		int i,j;
		int max=0,min=0;
		char maxElement='\0',minElement='\0';
		for(i=0;i<y.length;i++)
		{
			 k=1;
			for(j=i+1;j<y.length;j++)
			{
				if(y[i]==y[j])
				{
					k++;
					y[j]='\0';
				}
				
			}
			if(y[i]!='\0')
			{
				
				ch[l++]=y[i];
				count[m++]=k;
			}
			
	}
		max=count[0];min=count[0];
		for(int k1=0;k1<l;k1++)
		{
			if(max<count[k1])
			{
				max=count[k1];
				maxElement=ch[k1];
			}
			else if(min>count[k1])
			{
				min=count[k1];
				minElement=ch[k1];
			}
		}
		System.out.println(maxElement);
		System.out.println(minElement);
	}
}
