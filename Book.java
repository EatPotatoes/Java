/**
 * CLass to hold a book object with title, author, isbn, pages, subject
 */
public class Book 
{
	private String title;
	private String author;
	private String ISBN;
	private int pages;
	private String subject;
	
	/**
	 * Constructor for a default book
	 */
	public Book()
	{
		title = "Default Book";
		author = "Default Author";
		ISBN = "Default ISBN";
		pages = 0;
		subject = "Default Subject";
	}
	
	/**
	 * constructor for custom book object
	 * @param title
	 * @param author
	 * @param ISBN
	 * @param pages
	 * @param subject
	 */
	public Book(String title, String author, String ISBN, int pages, String subject)
	{
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.pages = pages;
		this.subject = subject;
	}

	/**
	 * @return the title
	 */
	public String getTitle() 
	{
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) 
	{
		this.title = title;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() 
	{
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) 
	{
		this.author = author;
	}

	/**
	 * @return the iSBN
	 */
	public String getISBN() 
	{
		return ISBN;
	}

	/**
	 * @param iSBN the iSBN to set
	 */
	public void setISBN(String isbn) 
	{
		ISBN = isbn;
	}

	/**
	 * @return the pages
	 */
	public int getPages() 
	{
		return pages;
	}

	/**
	 * @param pages the pages to set
	 */
	public void setPages(int pages) 
	{
		this.pages = pages;
	}

	/**
	 * @return the subject
	 */
	public String getSubject() 
	{
		return subject;
	}

	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) 
	{
		this.subject = subject;
	}
	
	/**
	 * Returns the string representation of the book in the format
	 * Title: ________
	 * Author: ________
	 * ISBN: ________
	 * Pages: ________
	 * Subject: ________
	 */
	@Override
	public String toString()
	{
		String result = "";
		result += "Title: " + title;
		result += "\nAuthor: " + author;
		result += "\nISBN: " + ISBN;
		result += "\nPages: "+pages;
		result += "\nSubject: "+subject;
		return result;
	}
}
