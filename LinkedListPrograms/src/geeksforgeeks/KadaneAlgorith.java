package geeksforgeeks;

public class KadaneAlgorith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,-2,-1,5,-2};
		int max=0;
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			if(sum>max)
			{
				max=sum;
			}
			else if(sum<0)
			{
				sum=0;
			}
		}
		System.out.println(max);

	}

}
