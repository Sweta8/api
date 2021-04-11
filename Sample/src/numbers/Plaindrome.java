package numbers;

public class Plaindrome {
	public static void main(String[] args)
	{
		
	int no=111,d=0,sum=0;
	int s=no;
	while(no>0)
	{
		d=no%10;
		sum=sum*10+d;
		no=no/10;
	}
	if(sum==s)
	{
		System.out.println("Plaindrome no");
	}
	else
	{
		System.out.println("Not plaindrome no");
	}

}
}
