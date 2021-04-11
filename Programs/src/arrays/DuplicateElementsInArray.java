package arrays;

public class DuplicateElementsInArray {
	
	public static void main(String[] args)
	{
		int a[]= {20,30,40,1,50,60,1,1,50,60};
		for(int i=0;i<a.length;i++)
		{
			int k=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					k++;
					a[j]=-1;
				}
			}
			if(a[i]!=-1&& k>1) {
				System.out.println(a[i]+" "+k);
			}
		}
	}

}
