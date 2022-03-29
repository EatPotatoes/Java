import java.util.Scanner;

public class PalindromeTrawler 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Input string: ");
		String s = scan.nextLine();
		System.out.println(s);
		
		String sFormat = s.replace(" ", "");
		
		for (int startIndex = 0; startIndex < sFormat.length() - 3; startIndex++)
		{
			for (int endIndex = startIndex + 3; endIndex < sFormat.length() + 1; endIndex++)
			{
				String sub = sFormat.substring(startIndex, endIndex);
				if(palindromeTest(sub))
				{
					System.out.println(startIndex + " " + sub);
				}
			}
		}
		System.out.println();
	}
	public static boolean palindromeTest(String original)
	{
		String str = original.toLowerCase();
		for( int x = 0; x < str.length(); x++)
		{
			if(str.charAt(x) != str.charAt(str.length()-1-x))
			{
				return false;
			}
		}
		return true;
	}
}
