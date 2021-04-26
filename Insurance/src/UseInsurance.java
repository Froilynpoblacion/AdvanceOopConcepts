import java.util.Scanner;
public class UseInsurance
{
	public static void main (String [] args)
	{
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please choose insurance type: 1 = Life , 2=  Health");
		int a = input.nextInt();
		
		if (a == 1)
		{
			Life LifeInsurance = new Life (null, 0);
			LifeInsurance.display();
			
		}
		else
		{
			Health healthInsurance = new Health(null,0);
			healthInsurance.display();
			
		}		
	}	
		
}