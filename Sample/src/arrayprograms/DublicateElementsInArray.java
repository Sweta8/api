package arrayprograms;

public class DublicateElementsInArray {
	
	public static void main(String[] args)
	{
		int a[]= new int[]{1, 2, 3, 4, 2, 7, 8, 8, 3, 8, 8,2,9,10,10,15,9,17,10,17}; 
		int i,j;
		for( i = 0; i < a.length; i++) {  
			int k=1;
            for( j = i + 1; j < a.length; j++) {  
                if(a[i] == a[j])  
                {
                	k++;
                	a[j]=-1;
                }
                     
			}
			
			if(a[i]!=-1&&k>1)
			{
				System.out.println(a[i]+" "+k);
			}
				
			
	}
	}
}
