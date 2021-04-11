package stringPrograms;

public class toUpperCaseAndLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="Sweta IS singing";
		String y="";
		for(int i=0;i<x.length();i++)
		{
			char ch=x.charAt(i);
			if(ch>='a'&& ch<='z')
			{
				y=y+Character.toUpperCase(ch);
			}
			else
			{
				y=y+Character.toLowerCase(ch);
			}
		}
		System.out.println(y);
	}

}
