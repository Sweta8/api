package revision;

import java.util.Scanner;

public class Pattern {
	    public int[] solution(int N) {
	        // write your code in Java SE 8
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter nos");
	        int a[]=new int[N];
	        for(int i=0;i<N;i++)
	        {
	            a[i]=sc.nextInt();
	        }
	        return a;
	    }
	    public int find_min(int[] A) {
	    int ans = 0;
	    for (int i = 1; i < A.length; i++) {
	        if (ans > A[i]) {
	            ans = A[i];
	        }
	    }
	    return ans;
	    }
	    public static void main(String[] args)
	    {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter size of array");
	        int N=sc.nextInt();
	        Pattern s=new Pattern();
	        System.out.println(s.find_min(s.solution(N)));
	    }
	    }

