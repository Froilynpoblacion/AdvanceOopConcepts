public class BookArray 
{
	public static void main(String[] args)
	{
		Book[] books = new Book[10];
		books[0] = new FictionBook ("Fictional: Lord of the Rings");
		books[1] = new FictionBook ("Fictional: Harry Potter");
		books[2] = new FictionBook ("Fictional: Twilight Saga");
		books[3] = new FictionBook ("Fictional: The Hobbit");
		books[4] = new FictionBook ("Fictional: Crime and Punishment");
		books[5] = new NonFiction ("NonFictional: Holy Bible");
		books[6] = new NonFiction ("NonFictional: NKJV");
		books[7] = new NonFiction ("NonFictional: Silent Spring");
		books[8] = new NonFiction ("NonFictional: A room of Ones room");
		books[9] = new NonFiction ("NonFictional: Bury My Heart at Wounded Knee");
		
		for(int i = 0; i < books.length; i++)
		{
			System.out.println(books[i].getTitle() + " for $" + books[i].getPrice());
		}
	}
}