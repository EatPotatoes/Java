//Albert Zhang 2/4/22
//Strings in Java and their methods
public class Strings 
{

	public static void main(String[] args) 
	{
		String originalString = "The quick brown fox jumps over the lazy dog.";
		System.out.println("The original string is: \n" + originalString);
		System.out.println("012345678901234567890123456789012345678901234567890");
		
		char firstChar = originalString.charAt(0);
		System.out.println("The character at index of 0 is: " + firstChar);
		
		char midChar = originalString.charAt(20);
		System.out.println("The character at index of 20 is: " + midChar);
		
		int compare = originalString.compareTo("dog");
		System.out.println("Original compared to \"dog\": " + compare);
		System.out.println("    This is because the ASCII value for the \"d\" in dog is 100,\n    where the \"T\" is 84, a difference of -16");
		
		String concat = originalString.concat(" It was hungry.");
		System.out.println("Original string + \" It was hungry.\": " + concat);
		
		boolean same = originalString.equals("The quick brown fox jumps over the lazy dog.");
		System.out.println("Original string compared to \"The quick brown fox jumps over the lazy dog.\": "+ same);
		
		boolean notSame = originalString.contentEquals("cow");
		System.out.println("Original string compared to \"cow\": " + notSame);
		
		boolean sameWithoutCase = originalString.equalsIgnoreCase("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.");
		System.out.println("Original string compared without case to \"THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.\": " + sameWithoutCase);
		
		int index = originalString.indexOf("fox");
		System.out.println("Index of \"fox\" in original string: " + index);
		
		int len = originalString.length();
		System.out.println("Length of the original string: " + len);
		
		String changed = originalString.replace("f", "b");
		System.out.println("Original string replacing \"f\" with \"b\": " + changed);
		
		String sub1 = originalString.substring(0, 16);
		System.out.println("Original string with only indexes 0-16: " + sub1);
		
		String sub2 = originalString.substring(35);
		System.out.println("Original string from index 35-end: " + sub2);
		
		String lower = originalString.toLowerCase();
		System.out.println("Original string all lowercase: " + lower);
		
		String upper = originalString.toUpperCase();
		System.out.println("Original string all uppercase: " + upper);
	}

}
