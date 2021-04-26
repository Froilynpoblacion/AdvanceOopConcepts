public class FictionBook extends Book
{

	public FictionBook(String BT) 
	{
		super(BT);
		setPrice();
	}

	@Override
	void setPrice()
	{
		price = 24.99;
	}

}