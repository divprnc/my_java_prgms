import java.util.Scanner;
class EmailValidator 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		while (true)
		{
			System.out.print("Enter email: ");
			String s = scn.nextLine();
			int fromIndex = s.indexOf( '@' );
			if ( fromIndex != -1 && s.indexOf ( '.' , fromIndex ) != -1 )
			{
				System.out.println("Activation link is sent to ur alternate email id");
				break;
			}
			else 
			{
				System.out.println("Email is not valid");
			}
		}
	}
}