public class Life extends Insurance
{
	public Life(String insurancetype, int monthlycost) 
	{
		super("Life", monthlycost);
		setCost();
		
	}
	
	void setCost()
	{
	
	monthlycost = 36;
	
    }
	void display() 
	{
		System.out.println("Insurance type :" + getInsurancetype());
		System.out.println("Monthly fee :$" + getMonthlycost());
	}
}
		