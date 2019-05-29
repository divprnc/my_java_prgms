import java.util.Scanner;
import java.util.regex.*;
class PasswordCheck 
{
	static boolean uppercase(String s)
	{
		char ch[] = s.toCharArray();
		for (int i = 0; i < s.length(); i++)
		{
			if (Character.isUpperCase(ch[i]))
				return true;
		}
		System.out.println("Password must contain atleast 1 uppercase letter");
		return false; 
	}
	static boolean lowercase(String s)
	{
		char ch[] = s.toCharArray();
		for (int i = 0; i < s.length(); i++)
		{
			if (Character.isLowerCase(ch[i]))
				return true;
		}
		System.out.println("Password must contain atleast 1 lowercase letter");
		return false; 
	}
	static boolean specialchars(String s)
	{
		Pattern pat = Pattern.compile("[@#$%^&*]");
		Matcher mat = pat.matcher(s);
		if (mat.find())
			return true;
		System.out.println("Password must contain atleast 1 special symbol");
		return false;
	}
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter password:");
		String password = scn.nextLine();
		if (password.length() >= 8)
		{
			if (uppercase(password))
				if (lowercase(password))
					if (specialchars(password))
					System.out.println("Password is Valid");
		}
		else
			System.out.println("Password must atleast 8 characters long");
	}
}