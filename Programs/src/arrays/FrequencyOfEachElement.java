package arrays;

public class FrequencyOfEachElement {
	
	public static void main(String[] args)
	{
		int a[]= {10,20,50,90,90,80,70,80,60,60};
		int i,j,k;
		for(i=0;i<a.length;i++)
		{
			k=1;
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					k++;
					a[j]=-1;
				}
			}
			if(a[i]!=-1)
			{
				System.out.println(a[i]+" "+k);
			}
		}
	}

}
