package numbers;

public class FactorialOfNo {
	
	public static void main(String[] args)
	{
		int no=5,fact=1;
		for(int i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
