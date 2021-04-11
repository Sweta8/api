
public interface countNumberOfCharacterInAString {
	
	public static void main(String[] args)
	{
		String x="Java gsghs jjjj";
		String c="g";
		int count= x.length()-x.replace(c,"").length();
		System.out.println(count);
	}

}
