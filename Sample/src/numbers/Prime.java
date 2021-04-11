package numbers;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=11,k=0;
		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
			{
				k++;
			}
		}
			if(k==2)
			{
				System.out.println("Prime no");
			}
			else
			{
				System.out.println("Not prime");
			}

	}

}
