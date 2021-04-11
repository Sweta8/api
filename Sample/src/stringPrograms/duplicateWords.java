package stringPrograms;

public class duplicateWords {
	
	public static void main(String[] args)
	{
		String x="My name is sweta is sweta";
		x=x.toLowerCase();
		String c[]=x.split(" ");
		for(int i=0;i<c.length;i++)
		{
			int k=1;
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i].equalsIgnoreCase(c[j]))
				{
					k++;
					c[j]="";
				}
			}
			if(c[i]!=""&& k>1)
			{
				System.out.println(c[i]+" "+k);
			}
		}
	}

}
