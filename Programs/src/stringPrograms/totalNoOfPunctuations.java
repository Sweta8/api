package stringPrograms;

public class totalNoOfPunctuations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x="Sweta ? is?? singing";
		x=x.replace(" ", "");
		String x1=x.replace("?", "");
		System.out.println(x.length()-x1.length());

	}

}
