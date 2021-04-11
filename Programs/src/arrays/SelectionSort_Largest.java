package arrays;

public class SelectionSort_Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,50,60};
		int i,j,temp;
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[j]>a[i])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
