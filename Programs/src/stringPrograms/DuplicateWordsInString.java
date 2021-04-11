package stringPrograms;

public class DuplicateWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x="sweta is Singing sweta";
		x=x.toLowerCase();
		String y[]=x.split(" ");
		for(int i=0;i<y.length;i++)
		{
			int k=1;
			for(int j=i+1;j<y.length;j++)
			{
				if(y[i].equalsIgnoreCase(y[j]))
				{
					k++;
					y[j]="";
				}
			}
			if(k>1)
			{
				System.out.println(y[i]+" "+k);
			}
		}

	}

}
