import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SortEfficiency 
{
	public static void main(String[] args) throws IOException
	{
		ArrayList<String> text = readInFromFile("Gadsby.txt");
		String[] bubbleList = new String[text.size()];
		String[] selectionList = new String[text.size()];
		String[] insertionList = new String[text.size()];
		for(int x = 0; x < text.size(); x++)
		{
			bubbleList[x] = text.get(x);
			selectionList[x] = text.get(x);
			insertionList[x] = text.get(x);
		}
		
		
		long bubbleStart = System.nanoTime();
		bubbleSort(bubbleList);
		long bubbleEnd = System.nanoTime();
		long bubbleTime = bubbleEnd - bubbleStart;
		
		long selectionStart = System.nanoTime();
		selectionSort(selectionList);
		long selectionEnd = System.nanoTime();
		long selectionTime = selectionEnd - selectionStart;
		
		long insertionStart = System.nanoTime();
		insertionSort(insertionList);
		long insertionEnd = System.nanoTime();
		long insertionTime = insertionEnd - insertionStart;
		
		System.out.println("Time for Bubble Sort: " + bubbleTime);
		System.out.println("Time for Selection Sort: " + selectionTime);
		System.out.println("Time for Insertion Sort: " + insertionTime);
		
		
		String[] newBubble = new String[text.size() + 1];
		String[] newSelection = new String[text.size() + 1];
		String[] newInsertion = new String[text.size() + 1];
		
		for(int x = 0; x < text.size() + 1; x++)
		{
			if (x == 0)
			{
				newBubble[x] = "jawn";
				newSelection[x] = "jawn";
				newInsertion[x] = "jawn";
			} else
			{
				newBubble[x] = text.get(x - 1);
				newSelection[x] = text.get(x - 1);
				newInsertion[x] = text.get(x - 1);
			}
		}
		
		long newBubbleStart = System.nanoTime();
		bubbleSort(newBubble);
		long newBubbleEnd = System.nanoTime();
		long newBubbleTime = newBubbleEnd - newBubbleStart;
		
		long newSelectionStart = System.nanoTime();
		selectionSort(newSelection);
		long newSelectionEnd = System.nanoTime();
		long newSelectionTime = newSelectionEnd - newSelectionStart;
		
		long newInsertionStart = System.nanoTime();
		insertionSort(newInsertion);
		long newInsertionEnd = System.nanoTime();
		long newInsertionTime = newInsertionEnd - newInsertionStart;
		
		System.out.println("--------WITH JAWN--------");
		System.out.println("New time for Bubble Sort: " + newBubbleTime);
		System.out.println("New time for Selection Sort: " + newSelectionTime);
		System.out.println("New time for Insertion Sort: " + newInsertionTime);
	}
	
	public static ArrayList<String> readInFromFile( String fileName)
	{
		ArrayList<String> linesOfText = new ArrayList<String>();
		String line, word;
		
		Scanner input = null;
		try {
			input = new Scanner(new File(fileName));
			//input.useDelimiter("\\s*");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(input.hasNext())
		{
			line = input.next();
			linesOfText.add(line);
		}	
		
		return linesOfText;
	}
	
	public static void selectionSort (String[] numbers)
	   {
	      int min;
	      String temp;

	      for (int index = 0; index < numbers.length-1; index++)
	      {
	         min = index;
	         for (int scan = index+1; scan < numbers.length; scan++)
	            if (numbers[scan].compareToIgnoreCase(numbers[min]) < 0)
	               min = scan;

	         // Swap the values
	         temp = numbers[min];
	         numbers[min] = numbers[index];
	         numbers[index] = temp;
	      }
	   }

	   public static void bubbleSort (String[] characters)
	   {
		   for (int i = 0; i < characters.length - 1; i++)
		   {
			   for (int j = 0; j < characters.length - i - 1; j++)
			   {
				   if (characters[j].compareToIgnoreCase(characters[j + 1]) > 0)
				   {
					   String temp = characters[j];
					   characters[j] = characters[j + 1];
					   characters[j + 1] = temp;
				   }
			   }
		   }
	   }
	   
	   //-----------------------------------------------------------------
	   //  Sorts the specified array of integers using the insertion
	   //  sort algorithm.
	   //-----------------------------------------------------------------
	   public static void insertionSort (String[] numbers)
	   {
	   	String key;      //value that i will compare to
	   	int position; //where i am comparing in my array
	   
	      for (int index = 1; index < numbers.length; index++)
	      {
	         key = numbers[index];
	         position = index;

	         // shift larger values to the right
	         while (position > 0 && numbers[position-1].compareToIgnoreCase(key) > 0)
	         {
	            numbers[position] = numbers[position-1];
	            position--;
	         }
	            
	         numbers[position] = key;
	      }
	   }
}

/*
 * Part 1
 * 	1. Insertion sort ran the fastest. I did expect it to be fastest because it
 * 	   only had a for loop and a while loop while the other two had two for loops
 * 	2. The timings were pretty consistent, but were not exactly the same because
 * 	   of other factors background tasks and things outside the program.
 * Part 2
 * 	3. After inserting "jawn" the same results occurred, with Insertion sort being
 *     the fastest and bubble sort being the slowest
 *  4. System time is inconsistent because some computers will run faster than others
 *  5. Efficiency of sorting algorithms can be consistently compared through the number
 *     of iterations or steps it needs to take to complete the task, only dependent
 *     on the algorithm and not external factors such as computer capabilities. 
 * 
 * 
 */
