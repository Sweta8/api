package stringPrograms;

public class lowerToUpperandViceversa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="My name is Sweta ";
		String x1="";
		for(int i=0;i<x.length();i++)
		{
			char c=x.charAt(i);
			if(c>='A'&& c<='Z')
			{
				x1=x1+Character.toLowerCase(c);
			}
			else if(c>='a'&& c<='z')
			{
				x1=x1+Character.toUpperCase(c);
			}
			else if(c==' ')
			{
				x1=x1+c;
			}
		}
		System.out.println(x1);

	}

}
