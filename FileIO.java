import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO 
{

	public static void main(String[] args) throws IOException
	{
		ArrayList<String> text = readInFromFile("text.txt");
		
		String str = text.get(0);
		String result = str;
		System.out.println(str);
		
		if (str.contains("s"))
			result = result.replace("s", "$");
		if (str.indexOf("S") != -1)
			result = result.replace("S", "$");
		if (str.indexOf("a") != -1)
			result = result.replace("a", "@");
		if (str.indexOf("A") != -1)
			result = result.replace("A", "@");
		if (str.indexOf("the") != -1)
			result = result.replace("the", "teh");
		
		writeFile("result.txt", result);
	}
	
	public static ArrayList<String> readInFromFile( String fileName)
	{
		ArrayList<String> linesOfText = new ArrayList<String>();
		String line, word;
		
		Scanner input = null;
		try {
			input = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(input.hasNext())
		{
			line = input.nextLine();
			linesOfText.add(line);
		}	
		
		return linesOfText;
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
