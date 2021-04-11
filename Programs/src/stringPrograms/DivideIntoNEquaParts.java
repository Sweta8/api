package stringPrograms;

public class DivideIntoNEquaParts {
	
	public static void main(String[] args)
	{
		String x="aaaabbbbcccc";
		int n=3,p=0,k=0;
		String y[]=new String[n];
		if(x.length()%n!=0)
		{
			System.out.println("String cannot be divided into n equal parts");
		}
		else
		{
		 p=x.length()/n;
		 System.out.println(p);
		 for(int i=0;i<x.length();i=i+p)
		 {
               
             String part=x.substring(i,i+p);
             y[k] = part;
             k++;
			 
		 }
		for(int j=0;j<y.length;j++)
		{
			System.out.println(y[j]);
		}
		}
	}

}
