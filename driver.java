
public class driver 
{
	public static void main(String[] args) 
	{
		//creates a book object by directly setting with strings
		Book b1 = new Book("The Lightning Thief", "Rick Riordan", "Miramax Books", "January 1st, 2000", "9781423121701");
		System.out.println(b1.toString());
		
		//creates a book object using variables as data
		String title2 = new String("Thank You for Arguing");
		String author2 = new String("Jay Heinrichs");
		String publisher2 = new String("Crown Publishing Group");
		String copyrightDate2 = new String("July 4th, 2017");
		String ISBN2 = new String("9780804189934");
		Book b2 = new Book(title2, author2, publisher2, copyrightDate2, ISBN2);
		System.out.println(b2.toString());
		
		//creates am empty book object and sets the data using setters
		Book b3 = new Book();
		System.out.println("WITHOUT INITIALIZING INFORMATION");
		System.out.println(b3.toString());
		b3.setTitle("Nineteen Eighty-Four");
		b3.setAuthor("George Orwell");
		b3.setPublisher("Secker & Warburg");
		b3.setCopyrightDate("June 8th, 1949");
		b3.setISBN("9780140817744");
		System.out.println("AFTER USING SETTERS");
		System.out.println(b3.toString());
	}
}
/*
1. What is Project Gutenberg?
	Project Gutenberg is a volunteer effort to archive works of literature, and encourage the creation
	and distribution of eBooks. It was founded by Michael S. Hart in 1971, and is the oldest digital library.
2. How is this relevant to you as a high school student?
	Project Gutenberg is relevant to me as a high school student because it is a useful resource for needing to
	access any information that may only be available through books, which are archived through the project.
*/