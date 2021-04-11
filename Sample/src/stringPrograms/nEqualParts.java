package stringPrograms;

public class nEqualParts {
	
	public static void main(String[] args)
	{
		String x="aaaabbbbcccc";
		int parts=3,temp=0;
		int l=(x.length())/parts;
		String a[]=new String[parts];
		
		System.out.println(l);
		for(int i=0;i<x.length();i=i+l)
		{
			String parting=x.substring(i,i+l);
		    a[temp++]=parting;
		    
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
