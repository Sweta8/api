package geeksforgeeks;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,3,4,5,};
		int b[]= {0,2};
		int n=a.length;
		int n1=b.length;
		int i=0,j=0,k=0;
		int c[]=new int[a.length+b.length];
		while(i<n&&j<n1)
		{
			if(a[i]<b[i])
			{
				c[k++]=a[i++];
			}
			else
			{
				c[k++]=b[j++];
			}
		}
		while(i<n)
		{
			c[k++]=a[i++];
		}
		while(j<n1)
		{
			c[k++]=b[j++];
		}
		
		for(int m=0;m<c.length;m++)
		{
			System.out.println(c[m]);
		}

	}

}
