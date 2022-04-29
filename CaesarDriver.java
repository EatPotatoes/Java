import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CaesarDriver {

	public static void main(String[] args) throws IOException
	{
		System.out.println("----------PART 1 CAESAR CIPHER----------");
		
		String line, word;
		
		Scanner input = new Scanner(new File("test.txt"));
		
		line = "";
		
		Scanner user = new Scanner(System.in);
		System.out.println("Enter shift: ");
		int userShift = Integer.parseInt(user.next());
		
		Caesar cipher = new Caesar(userShift);
		
		while(input.hasNext())
		{
			line = input.nextLine();
			
			Scanner sc = new Scanner(line);
			
			String result = "";
			while(sc.hasNext())
			{
				word = sc.next();
				/*
				result = result + "Plain Text: ";
				result = result + word + "\nCipher Text: ";
				result = result + cipher.encrypt(word) + "\nRecovered Text: ";
				result = result + cipher.decrypt(cipher.encrypt(word)) + "\n----------\n";		 
				 */
				
				result = result + cipher.encrypt(word) + " ";
				writeFile("result.txt", result);
			}		
		}
		
		System.out.println("Reading in test.txt\nWriting to result.txt");
		
		System.out.println("----------PART 2 FREQUENCY ANALYSIS----------");
		
		System.out.println("Reading in ciphertext.txt\nDictionary is Dictionary1.txt");
		
		int[] letters = new int[26];
		ArrayList<String> text = new ArrayList<String>();
		
		Scanner in = new Scanner(new File("ciphertext.txt"));
		
		while(in.hasNext())
		{
			line = in.nextLine();
			Scanner sc = new Scanner(line);
			
			while(sc.hasNext())
			{
				word = sc.next().toUpperCase().replaceAll("[^A-Za-z0-9]","");
				text.add(word);
				for(int x = 0; x < word.length(); x++)
				{
					if ((int)word.charAt(x) >= 65 && (int)word.charAt(x) <= 90)
						letters[(int)word.charAt(x) - 65] += 1;
				}
			}		
		}
		
		ArrayList<String> dictionary = new ArrayList<String>();
		
		Scanner dict = new Scanner(new File("Dictionary1.txt"));
		
		while(dict.hasNext())
		{
			line = dict.nextLine();
			Scanner sc = new Scanner(line);
			
			while(sc.hasNext())
			{
				word = sc.next().toUpperCase();
				dictionary.add(word);
			}		
		}
		
		int maxIndex = 0;
		int max = 0;
		for (int i = 0; i < letters.length; i++)
		{
			//System.out.println((char)(i + 65) + ": " + letters[i]);
			if (letters[i] > max)
			{		
				max = letters[i];
				maxIndex = i;
			}
		}
		
		char[] commonLetters = {'E', 'T', 'A', 'O', 'I', 'N', 'S', 'R', 'H', 'D', 'L', 'U', 'C', 'M', 'F', 'Y', 'W', 'G', 'P', 'B', 'V', 'K', 'X', 'Q', 'J', 'Z'};
		
		for (int a = 0; a < commonLetters.length; a++)
		{
			int shift = (maxIndex + 65) - (int)(commonLetters[a]);
			
			if (dictionary.contains(cipher.decrypt(text.get(a), shift)))
			{
				System.out.println("-----FOUND-----");
				System.out.println("Shift: " + shift);
				String result2 = "";
				for (int y = 0; y < text.size(); y++)
				{
					result2 = result2 + cipher.decrypt(text.get(y), shift) + " ";
				}
				writeFile("result2.txt", result2);
			}
		}
		
		System.out.println("Writing to result2.txt");
		
				
		//read in dictionary
		//compare most common letter to E, then so on ARRAYLIST.CONTAINS
		//	if this comparison is the correct shift and has words in dictionary, show shift and recovered text
	}
	
	public static void writeFile(String oFileName, String data) 
	{
	    try
	    {
	        BufferedWriter out = new BufferedWriter(new FileWriter(oFileName));
	        out.write(data + "\n");
	        out.close();
	    } catch (IOException e) {}
	}

}
