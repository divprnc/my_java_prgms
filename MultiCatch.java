import java.util.Scanner;
class MultiCatch 
{
	public static void main(String[] args) 
	{
		try
		{
			Scanner scn = new Scanner(System.in);
			System.out.print("Enter the number: ");
			String s = scn.nextLine();
			int num = Integer.parseInt(s);
			int div = num/0;
		}
		catch (ArithmeticException | NumberFormatException e)
		{
			if (e instanceof ArithmeticException )
				System.out.println("Division by zero");
			else if (e instanceof NumberFormatException)
				System.out.println("Enter valid number only");
			else
				e.printStackTrace();
		}
	}
}