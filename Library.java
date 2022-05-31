import java.util.ArrayList;

public class Library 
{
	private String librarian;
	private String location;
	private ArrayList<Book> books;
	
	public Library()
	{
		librarian = "default name";
		location = "default library";
		books = new ArrayList<Book>(0);
	}
	
	public String getLibrarian()
	{
		return librarian;
	}
	
	public void setLibrarian(String librarian)
	{
		this.librarian = librarian;
	}
	
	public String getLocation()
	{
		return location;
	}
	
	public void setLocation(String location)
	{
		this.location = location;
	}
	
	public ArrayList<Book> getBooks()
	{
		return books;
	}
	
	public void addBook(Book book)
	{
		books.add(book);
	}
	
	public void removeBook(Book book)
	{
		if(books.contains(book))
		{	
			books.remove(book);
		}
		else
		{
			System.out.println(book + " is not in the library");
		}
	}
	
	public void printBooks()
	{
		for(int x = 0; x < books.size(); x++)
		{
			System.out.println(books.get(x).getTitle());
		}
	}
	
	public void printAuthors()
	{
		for(int x = 0; x < books.size(); x++)
		{
			System.out.println(books.get(x).getAuthor());
		}
	}
	
	public void displayAllBooksFromAuthor(String author)
	{
		System.out.print("Books by " + author + ": ");
		for(int x = 0; x < books.size(); x++)
		{
			if(author.equalsIgnoreCase(books.get(x).getAuthor()))
			{
				System.out.print(books.get(x).getTitle() + " | ");
			}
		}
		System.out.println();
	}
	
	public void findBookByTitle(String title)
	{
		System.out.println("Information about " + title);
		System.out.println("---");
		for(int x = 0; x < books.size(); x++)
		{
			if(title.equalsIgnoreCase(books.get(x).getTitle()))
			{
				System.out.println(books.get(x));
			}
		}
		System.out.println("---");
	}
	
	public String toString()
	{
		String result = "";
		
		for(int x = 0; x < books.size(); x++)
		{
			result = result + "Title: " + books.get(x).getTitle() + " | ";
			result = result + "Author: " + books.get(x).getAuthor() + " | ";
			result = result + "ISBN: " + books.get(x).getISBN() + " | ";
			result = result + "Page Count: " + books.get(x).getPages() + " | ";
			result = result + "Subject: " + books.get(x).getSubject() + " | ";
			
			result = result + "\n====================================================================================================================================================================\n";
		}
		
		return result;
	}
}
