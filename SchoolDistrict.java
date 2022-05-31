import java.util.ArrayList;

public class SchoolDistrict 
{
	private String superIntendant;
	private String location;
	private ArrayList<Library> libraries;
	
	public SchoolDistrict()
	{
		superIntendant = "default name";
		location = "default distict";
		libraries = new ArrayList<Library>(0);
	}
	
	public String getSuperIntendant()
	{
		return superIntendant;
	}
	
	public void setSuperIntendant(String superIntendant)
	{
		this.superIntendant = superIntendant;
	}
	
	public String getLocation()
	{
		return location;
	}
	
	public void setLocation(String location)
	{
		this.location = location;
	}
	
	public ArrayList<Library> getLibraries()
	{
		return libraries;
	}
	
	public void addLibrary(Library library)
	{
		libraries.add(library);
	}
	
	public void removeLibrary(Library library)
	{
		if(libraries.contains(library))
		{	
			libraries.remove(library);
		}
		else
		{
			System.out.println("Library not found");
		}
	}
	
	public void listLibrariesWithBook(String title)
	{
		System.out.println("Libraries with " + title);
		for(int x = 0; x < libraries.size(); x++)
		{
			for(int y = 0; y < libraries.get(x).getBooks().size(); y++)
			{
				Book currentBook = libraries.get(x).getBooks().get(y);
				if(title.equalsIgnoreCase(currentBook.getTitle()))
				{
					System.out.println(libraries.get(x).getLibrarian() + "'s Library");
				}
			}
		}
		System.out.println("-----");
	}
	
	public String toString()
	{
		String result = "";
		
		for (int a = 0; a < libraries.size(); a++)
		{
			result = result + "Library: " + libraries.get(a).getLibrarian() + "'s Library\n";
			for(int x = 0; x < libraries.get(a).getBooks().size(); x++)
			{
				result = result + "  Title: " + libraries.get(a).getBooks().get(x).getTitle() + " | ";
				result = result + "Author: " + libraries.get(a).getBooks().get(x).getAuthor() + " | ";
				result = result + "ISBN: " + libraries.get(a).getBooks().get(x).getISBN() + " | ";
				result = result + "Page Count: " + libraries.get(a).getBooks().get(x).getPages() + " | ";
				result = result + "Subject: " + libraries.get(a).getBooks().get(x).getSubject() + " | ";
			
				result = result + "\n  |====================================================================================================================================================================\n";
			}
			result = result + "\n";
		}
		
		return result;
	}
}
