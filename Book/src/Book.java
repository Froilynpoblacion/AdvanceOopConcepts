public abstract class Book 
{
	public String BookTitle;
	public double price;
	
	public Book(String BT)
	{
		BookTitle = BT;
	}
	public double getPrice() 
	{
		return price;
	}
	public String getTitle() 
	{
		return BookTitle;
	}
	abstract void setPrice();
}