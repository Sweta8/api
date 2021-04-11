package stringPrograms;

public class LargestAndSmallestWord {
	
	public static void main(String[] args)
	{
		
		String x="My name is sweta singh sweta singh";
		x=x.toLowerCase();
		String c[]=x.split(" ");
		String temp[]=new String[c.length];
		int freque[]=new int[c.length];
		String min_string=" ";
		String max_string=" ";
		int i,j;
		int f=0,f1=0;
		for(i=0;i<c.length;i++)
		{
			int k=1;
			for(j=i+1;j<c.length;j++)
			{
				if(c[i].equalsIgnoreCase(c[j]))
				{
					k++;
					c[j]="";
				}
			}
			
			if(c[i]!="")
			{
				System.out.println(c[i]+" "+k);
				temp[f++]=c[i];
				freque[f1++]=c[i].length();
			}
			
			}
		int max=0;
		int min=freque[0];
		 min_string=temp[0];
		max_string=temp[0];
		for(int p=0;p<f1;p++)
		{
		
		if(min>freque[p])
		{
			min=freque[p];
			min_string=temp[p];
		}
		else if(max<freque[p])
		{
			max=freque[p];
			max_string=temp[p];
		}
}
		System.out.println("Minimum is "+ min_string);
		System.out.println("Max is "+ max_string);
}
}