package stringPrograms;

import javax.swing.text.html.MinimalHTMLWriter;

public class minandmaxcharacterinstring {
	
	public static void main(String[] args)
	{
		String x="sssstllffffffdddss";
		x=x.toLowerCase();
		x=x.replace(' ', '\0');
		/*int temp[]=new int[x.length()];
		int f=0;*/
		char c_min='\0';
		char c_max='\0';
		int m=0,n=0;
		char [] ch=x.toCharArray();
		char[] temp = new char[ch.length];
		int freque[]=new int[ch.length];
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
				System.out.println("frequency of "+ ch[i]+" "+ k ) ;
				
				temp[m++]=ch[i];
				freque[n++]=k;
			}
		}
		int max=0;
		int min=freque[0];
		for(int f=0;f<n;f++)
		{
		
		if(min>freque[f])
		{
			min=freque[f];
			 c_min=temp[f];
		}
		else if(max<freque[f])
		{
			max=freque[f];
			 c_max=temp[f];
		}
}
		System.out.println("Minimum is "+ c_min);
		System.out.println("Max is "+ c_max);
	}
}
