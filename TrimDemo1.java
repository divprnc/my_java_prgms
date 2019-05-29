import java.util.Scanner;
class TrimDemo1 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		String capital;
		do
		{
			System.out.print("Enter capital:");
			capital = scn.nextLine();
			if ( capital.equals("Delhi"))
				System.out.println("State is India");
			else if ( capital.equals("Hyderabad"))
				System.out.println("State is Andhra Pradesh");
			else if ( capital.equals("Patna"))
				System.out.println("State is Bihar");
		}while (!capital.equals("stop"));
	}
}