import java.util.Scanner;
class FirstCharacterUpperCase 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name = scn.nextLine();
		char ch = name.charAt(0);
		String s1 = String.valueOf(ch);
		String s2 = s1.toUpperCase();
		String name1 = name.replaceFirst( s1, s2 );
		System.out.println(name1);
	}
}