package stringPrograms;

public class subsetOfString {
	
	public static void main(String[] args)
	{
		String x="FUN";
		int l=x.length();
		int n=(l*(l+1))/2;
		int k=0;
		String temp[]=new String[n];
		for(int i=0;i<l;i++)
		{
			for(int j=i;j<l;j++)
			{
				temp[k++]=x.substring(i,j+1);
				
			}
		}
		
		for(int i=0;i<temp.length;i++)
		{
			System.out.println(temp[i]);
		}
	}

}
