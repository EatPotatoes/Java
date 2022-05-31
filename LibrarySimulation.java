import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LibrarySimulation 
{

	public static void main(String[] args) 
	{
		String title = "";
		String author = "";
		String isbn = "";
		int pages = 0;
		String subject = "";
				
		ArrayList<String> text = readInFromFile("bookList1.txt");		
		ArrayList<Book> books = new ArrayList<Book>();
		
		//convert data to Book Format
		for(int i = 0; i < text.size(); i++)
		{
			StringTokenizer st = new StringTokenizer(text.get(i), "@");
			title = st.nextToken();
			author = st.nextToken();
			isbn = st.nextToken();
			pages = Integer.parseInt(st.nextToken());
			subject = st.nextToken();
			books.add(new Book(title, author, isbn, pages, subject));
		}
		
		Library lib = new Library();
		lib.setLibrarian("Lynn Brarean");
		lib.setLocation("123 Lie Berry Street");
		for(int i = 0; i < books.size(); i++)
		{
			lib.addBook(books.get(i));
		}
		System.out.println(lib.toString());
		
		System.out.println("Librarian: " + lib.getLibrarian());
		System.out.println("Location: " + lib.getLocation());
		System.out.println();
		
		lib.displayAllBooksFromAuthor("Leo Tolstoy");
		System.out.println();
		lib.findBookByTitle("Hamlet");
		
		title = "";
		author = "";
		isbn = "";
		pages = 0;
		subject = "";
				
		ArrayList<String> text2 = readInFromFile("bookList2.txt");		
		ArrayList<Book> books2 = new ArrayList<Book>();
		
		//convert data to Book Format
		for(int i = 0; i < text2.size(); i++)
		{
			StringTokenizer st = new StringTokenizer(text2.get(i), "@");
			title = st.nextToken();
			author = st.nextToken();
			isbn = st.nextToken();
			pages = Integer.parseInt(st.nextToken());
			subject = st.nextToken();
			books2.add(new Book(title, author, isbn, pages, subject));
		}
		
		Library lib2 = new Library();
		lib2.setLibrarian("John Book");
		lib2.setLocation("456 Libe Rare-E Road");
		for(int i = 0; i < books2.size(); i++)
		{
			lib2.addBook(books2.get(i));
		}
		
		SchoolDistrict hissawickon = new SchoolDistrict();
		hissawickon.setLocation("125 Rouston Hoad");
		hissawickon.setSuperIntendant("Bynne Llair");
		hissawickon.addLibrary(lib);
		hissawickon.addLibrary(lib2);
		hissawickon.listLibrariesWithBook("The Iliad");
		System.out.println(hissawickon.toString());
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
}
