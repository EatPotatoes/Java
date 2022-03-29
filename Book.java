/**
 * Creates a class to store the information of a book, and let the user change the information when neccessary
 * @author 23azhang
 *
 */
public class Book 
{
	//instance data
	private String title;
	private String author;
	private String publisher;
	private String copyrightDate;
	private String ISBN;
	
	/**
	 * Initiates the instance data of the book
	 * @param t is the title of the book
	 * @param a is the author of the book
	 * @param p is the publisher of the book
	 * @param c is the copyright date of the book
	 * @param i is the ISBN of the book
	 */
	public Book(String t, String a, String p, String c, String i)
	{
		title = t;
		author = a;
		publisher = p;
		copyrightDate = c;
		ISBN = i;
	}
	
	/**
	 * Initiates the instance data of the book to be later set by user
	 */
	public Book()
	{
		setTitle("Unkonwn");
		setAuthor("Unknown");
		setPublisher("Unknown");
		setCopyrightDate("Unknown");
		setISBN("Unknown");
	}
	
	/**
	 * Gets the title of the book
	 * @return the title of the book
	 */
	public String getTitle()
	{
		return title;
	}
	
	/**
	 * Gets the author of the book
	 * @return the author of the book
	 */
	public String getAuthor()
	{
		return author;
	}
	
	/**
	 * Gets the publisher of the book
	 * @return the publisher of the book
	 */
	public String getPublisher()
	{
		return publisher;
	}

	/**
	 * Gets the copyright date of the book
	 * @return the copyright date of the book
	 */
	public String getCopyrightDate()
	{
		return copyrightDate;
	}
	
	/**
	 * Gets the ISBN of the book
	 * @return the ISBN of the book
	 */
	public String getISBN()
	{
		return ISBN;
	}
	
	/**
	 * Sets the title of the book to str
	 * @param str the title to be changed to
	 */
	public void setTitle(String str)
	{
		this.title = str;
	}
	
	/**
	 * Sets the author of the book to str
	 * @param str the author to be changed to
	 */
	public void setAuthor(String str)
	{
		this.author = str;
	}
	
	/**
	 * Sets the publisher of the book to str
	 * @param str the publisher to be changed to
	 */
	public void setPublisher(String str)
	{
		this.publisher = str ;
	}

	/**
	 * Sets the copyright date of the book to str
	 * @param str the copyright date to be changed to
	 */
	public void setCopyrightDate(String str)
	{
		this.copyrightDate= str ;
	}
	
	/**
	 * Sets the ISBN of the book to str
	 * @param str the ISBN to be changed to
	 */
	public void setISBN(String str)
	{
		this.ISBN= str ;
	}
	
	public String toString() 
	{
		String result = "";
		result = result.concat("Title: " + title + "\n");
		result = result.concat("Author: " + author + "\n");
		result = result.concat("Publisher: " + publisher + "\n");
		result = result.concat("Copyright Date: " + copyrightDate + "\n");
		result = result.concat("ISBN: " + ISBN + "\n");
		return result;
	}
}
