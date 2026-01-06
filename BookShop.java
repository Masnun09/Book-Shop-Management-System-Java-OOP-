package Association;
import java.lang.*;
import Abstract.*;
import Child.*;

public final class BookShop
{
	private String name;
	private TextBook textBooks[] = new TextBook[100];
	private StoryBook storyBooks[] = new StoryBook[100];
	
	public BookShop(){};
	public BookShop(String name)
	{
		this.name = name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	
	public boolean insertTextBook(TextBook tb)
	{
		for(int i=0; i<this.textBooks.length; i++)
		{
			if(textBooks[i] == null)
			{
				this.textBooks[i] = tb;
				System.out.println("Text Book Inserted.");
				return true;
				
			}
		}
		System.out.println("Text Book Not Entered Yet.");
		return false;
		
	}
	public boolean removeTextBook(TextBook tb)
	{
		for(int i=0; i<textBooks.length; i++)
		{
			if(textBooks[i] == tb)
			{
				textBooks[i] = null;
				System.out.println("Text Book removed.");
				return true;
				
			}
		}
		return false;
	}
	public TextBook searchTextbook(String isbn)
	{
		for(int i=0; i<textBooks.length; i++)
		{
			if(textBooks[i] != null && textBooks[i].getIsbn().equals(isbn))
			{
				return textBooks[i];
				
			}
			
		}
		return null;
	}
	public void showAllTextBooks()
	{
		for(int i=0; i<textBooks.length; i++)
		{
			if(textBooks[i] != null)
			{
				textBooks[i].showDetails();
				System.out.println();
			}
		}
	}

	public boolean insertStoryBook(StoryBook sb)
	{
		for(int i=0; i<this.storyBooks.length; i++)
		{
			if(storyBooks[i] == null)
			{
				this.storyBooks[i] = sb;
				System.out.println("Story Book Inserted");
				return true;
				
			}
		}
		System.out.println("Story Book Not Entered Yet.");
		return false;
		
	}																																				
	public boolean removeStoryBook(StoryBook sb)
	{
		for(int i=0; i<storyBooks.length; i++)
		{
			if(storyBooks[i] == sb)
			{
				storyBooks[i] = null;
				System.out.println("Story Book Removed.");
				return true;
				
			}
		}
		return false;
	}
	public StoryBook searchStoryBook(String isbn)
	{
		for(int i=0; i<storyBooks.length; i++)
		{
			if(storyBooks[i] != null && storyBooks[i].getIsbn().equals(isbn))
			{
				return storyBooks[i];
			}
		}
		return null;
	}
	public void showAllStoryBooks()
	{
		for(int i=0; i<storyBooks.length; i++)
		{
			if(storyBooks[i] != null)
			{
				storyBooks[i].showDetails();
				System.out.println();
			}
		}
	}

}
