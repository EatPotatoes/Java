
public class Palindrome {

	public static void main(String[] args) 
	{
		String s = "racecar";
		
		System.out.println(palindromeTest(s));
	}
	
	public static boolean palindromeTest(String original)
	{
		String str = original.replace(" ", "");
		for (int x = 0; x < str.length(); x++)
		{
			if (str.charAt(x) != str.charAt(str.length() - 1 - x))
			{
				return false;
			}
		}
		return true;
	}

}
