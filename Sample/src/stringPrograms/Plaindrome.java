package stringPrograms;

public class Plaindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x="kkkk kkkk kkkk";
		String y="";
		for(int i=x.length()-1;i>=0;i--)
		{
			y=y+x.charAt(i);
		}
		
		if(x.equalsIgnoreCase(y))
		{
			System.out.println("plaindrome");
		}
		else
		{
			System.out.println("Not plaindrome");
		}
	}

}
