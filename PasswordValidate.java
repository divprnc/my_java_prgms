import java.util.Scanner;
import java.util.regex.*;
class PasswordValidate 
{
	static boolean uppercase(String s)
	{
		Pattern pat = Pattern.compile("[A-Z]");
		Matcher mat = pat.matcher(s);
		if (mat.find())
		{
			return true;
		}
		System.out.println("Password must contains atleast 1 uppercase characters");
		return false;
	}
	static boolean lowercase(String s)
	{
		Pattern pat = Pattern.compile("[a-z]");
		Matcher mat = pat.matcher(s);
		if (mat.find())
		{
			return true;
		}
		System.out.println("Password must contains atleast 1 lowercase characters");
		return false;
	}
	static boolean specialchars(String s)
	{
		Pattern pat = Pattern.compile("[@#$%&]");
		Matcher mat = pat.matcher(s);
		if (mat.find())
		{
			return true;
		}
		System.out.println("Password must contains atleast 1 specialcase characters");
		return false;
	}
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the password: ");
		String password = scn.nextLine();
		if (password.length() >=  8)
		{
			if (uppercase(password))
				if (lowercase(password))
					if (specialchars(password))
						System.out.println("Password is valid");
		}
		else
		{
			System.out.println("Password must be atleast 8 characters long");
		}
	}
}
