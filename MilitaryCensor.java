import java.util.Scanner;
import java.util.StringTokenizer;

public class MilitaryCensor 
{

	public static void main(String[] args) 
	{	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String s = scan.nextLine();
		
		StringTokenizer sentence = new StringTokenizer(s, " .,\n");
		
		while (sentence.hasMoreTokens())
		{
			String test = sentence.nextToken();
			if (test.compareToIgnoreCase("hermes") == 0)
			{
				System.out.println("REJECTED");
				System.exit(0);
			}
			else if (test.compareToIgnoreCase("bridge") == 0)
			{
				System.out.println("REJECTED");
				System.exit(0);
			}
			else if (test.compareToIgnoreCase("muddy") == 0)
			{
				System.out.println("REJECTED");
				System.exit(0);
			}
			else if (test.compareToIgnoreCase("river") == 0)
			{
				System.out.println("REJECTED");
				System.exit(0);
			}
			else if (test.compareToIgnoreCase("assault") == 0)
			{
				System.out.println("REJECTED");
				System.exit(0);
			}
			else if (test.compareToIgnoreCase("offensive") == 0)
			{
				System.out.println("REJECTED");
				System.exit(0);
			}
		}
		System.out.println("OK");
	}
}
