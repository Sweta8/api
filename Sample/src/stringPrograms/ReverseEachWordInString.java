package stringPrograms;

public class ReverseEachWordInString {
	
	public static void main(String[] args)
	{
		String x="My name is sweta";
		String c[]=x.split(" ");
		String reverse="";
		String b="";
		for(int i=0;i<c.length;i++)
		{
			for(int j=c[i].length()-1;j>=0;j--)
			{
				reverse=reverse+c[i].charAt(j);
			}
			b=b+" "+reverse;
			reverse="";
		}
		System.out.println(b);
	}
	

}
