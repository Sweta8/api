
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=121,s,d,sum=0;
		s=a;
		while(a>0)
		{
			d=a%10;
			sum=(sum*10)+d;
			a=a/10;
		}
		if(sum==s)
		{
			System.out.println("Palindrome No");
		}
		else
		{
			System.out.println("Palindr");
		}

	}

}
