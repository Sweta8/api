package stringPrograms;

public class removeWhiteSpacesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x="name is ";
		int l=x.length();
		String temp="";
		for(int i=0;i<x.length();i++)
		{
			if(x.charAt(i)!=' ')
			{
				temp=temp+x.charAt(i);
			}
		}
		int y=x.length()-temp.length();
		System.out.println("No of white spaces is " +y);

	}

}
