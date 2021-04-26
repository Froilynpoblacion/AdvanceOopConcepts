public class NonFiction extends Book
{

	public NonFiction(String BT) 
	{
		super(BT);
		setPrice();
	}

	@Override
	void setPrice()
	{
		price = 37.99;
	}

}