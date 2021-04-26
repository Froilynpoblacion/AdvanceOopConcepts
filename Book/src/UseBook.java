
public class UseBook 
{
	public static void main (String [] args)
	{
		Book books;
		books = new FictionBook ("Fictional: Lord of The Rings");
		System.out.println(books.getTitle() + " for $" + books.getPrice());
		books = new NonFiction ("NonFictional: Holy Bible");
		System.out.println(books.getTitle() + " for $" + books.getPrice());
	}
}