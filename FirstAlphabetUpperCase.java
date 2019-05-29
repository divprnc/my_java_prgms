/*
	split() is used to break the complete string into words and each word is being represented in the form of array.
	valueOf() is used to convert a character into String.
*/
import java.util.Scanner;
class FirstAlphabetUpperCase 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String string = scn.nextLine();
		String sarray[] = string.split(" ");
		int length = sarray.length;
		for (int i = 0; i < length; i++)
		{
			char ch = sarray[i].charAt(0);
			String s1 = String.valueOf(ch);
			String s2 = s1.toUpperCase();
			String string1 = sarray[i].replaceFirst(s1,s2);
			System.out.print(string1 + " ");
		}
		System.out.println();
	}
}
f