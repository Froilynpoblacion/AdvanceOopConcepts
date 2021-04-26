public class Health extends Insurance
{
		public Health(String insurancetype, int monthlycost) 
		{
			super("Health", monthlycost);
			setCost();
		}
	
		void setCost()
		{
			monthlycost = 196;
		}
		
		void display() 
		{
			System.out.println("Insurance type :" + getInsurancetype());
			System.out.println("Monthly fee is :$" + getMonthlycost());
		}
	
	
}
