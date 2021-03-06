// Factory method
import java.util.Scanner;
abstract class Plan
{
	protected float rate;
	abstract void getRate();
	void calculateBill(int unit)
	{
		System.out.println(unit*rate);
	}
}
class DomesticPlan extends Plan
{
	void getRate()
	{
		rate = 7.50F;
	}
}
class CommercialPlan extends Plan
{
	void getRate()
	{
		rate = 5.50F;
	}
}
class InstitutionalPlan extends Plan
{
	void getRate()
	{
		rate = 3.30F;
	}
}
class GetPlan
{
	Plan planType(String pname)
	{
		if (pname == null)
		{
			return null;
		}
		else if (pname.equalsIgnoreCase("Domestic"))
		{
			return new DomesticPlan();
		}
		else if (pname.equalsIgnoreCase("Commercial"))
		{
			return new CommercialPlan();
		}
		else if (pname.equalsIgnoreCase("Institutional"))
		{
			return new InstitutionalPlan();
		}
		return null;
	}
}
class ElectricityBillGenerate 
{
	public static void main(String[] args) 
	{
		GetPlan getPlan = new GetPlan();
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the plan name: ");
		String planName = scn.nextLine();
		System.out.print("Enter the number of units: " );
		int unit = scn.nextInt();
		Plan p = getPlan.planType(planName);
		System.out.print("Bill for " + planName + " plan consuming " + unit + " unit is : Rs.");
		p.getRate();
		p.calculateBill(unit);
	}
}