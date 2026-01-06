package Child;
import java.lang.*;
import Abstract.*;

public class StoryBook extends Book
{
	private String category;
	
	public StoryBook()
	{
		System.out.println();
	}
	
	public StoryBook(String isbn, String bookTitle, String autohorName, double price, int availableQuantity, String category)
	{
		super(isbn, bookTitle, autohorName, price, availableQuantity);
		this.category=category;
	}
	
	public void setCategory(String category)
	{
		this.category=category;
	}
	
	public String getCategory()
	{
		return category;
	}
}