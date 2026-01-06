import java.lang.*;
import java.util.*;
import Abstract.*;
import Child.*;
import Association.*;

public class Start {
    public static void main(String[] args)
	{
        TextBook tb1 = new TextBook("111", "Java Basics", "A. Karim", 400.0, 10, 12);
        TextBook tb2 = new TextBook("112", "Data Structures", "B. Rahman", 500.0, 15, 11);
        TextBook tb3 = new TextBook("113", "Algorithms", "C. Hossain", 600.0, 20, 10);
        TextBook tb4 = new TextBook("114", "OOP", "D. Islam", 450.0, 8, 9);
        TextBook tb5 = new TextBook("115", "Database", "E. Haque", 700.0, 12, 13);

        StoryBook sb1 = new StoryBook("201", "Horror Night", "J. Roy", 300.0, 10, "Horror");
        StoryBook sb2 = new StoryBook("202", "Sci-Fi Galaxy", "T. Mahmud", 350.0, 5, "Science Fiction");
        StoryBook sb3 = new StoryBook("203", "Fantasy World", "L. Nahar", 320.0, 6, "Fantasy");
        StoryBook sb4 = new StoryBook("204", "Detective Khan", "N. Jamil", 290.0, 4, "Mystery");
        StoryBook sb5 = new StoryBook("205", "Love Story", "A. Akter", 270.0, 7, "Romance");

        BookShop shop = new BookShop("AIUB Bookstore");

        
        shop.insertTextBook(tb1);
        shop.insertTextBook(tb2);
        shop.insertTextBook(tb3);
        shop.insertTextBook(tb4);
        shop.insertTextBook(tb5);
		shop.removeTextBook(tb4);
		System.out.println();
		

        shop.insertStoryBook(sb1);
        shop.insertStoryBook(sb2);
        shop.insertStoryBook(sb3);
        shop.insertStoryBook(sb4);
        shop.insertStoryBook(sb5);
		shop.removeStoryBook(sb3);
		System.out.println();

        System.out.println("Text Books");
        shop.showAllTextBooks();

        System.out.println("Story Books");
        shop.showAllStoryBooks();
                                          
        System.out.println("Searching Text Book");
		if(shop.searchTextbook("115") != null)
		{
			System.out.println("The Book You Were Searching: Found");
		}
		else
		{
			System.out.println("Text Book Not Found.");
		}
		
        System.out.println("Searching Story Book");
		
		if(shop.searchStoryBook("204") != null)
		{
			System.out.println("The Book You Were Searching: Found");
		}
		else
		{
			System.out.println("Story Book Not Found.");
		}  
		
    }
}
