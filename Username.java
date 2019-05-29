import java.util.*;
class Username 
{
	public static void main(String[] args) 
	{
		while(true)
		{
			System.out.print("Enter Username: ");
			Scanner scn = new Scanner(System.in);
			String s = scn.nextLine();
			if(s.isEmpty())
				System.out.println("Username cannot be empty");
			else
			{
				System.out.println("Username is valid");
				break;		
			}
		}
	}
}
