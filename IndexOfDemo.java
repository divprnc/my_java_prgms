/* indexOf() returns the index number of the character from the begining of the String.
	lastIndexOf() returns the index of the character from the last of the String. */
class IndexOfDemo 
{
	public static void main(String[] args) 
	{
		String s1 = "Welcome to the Java";
		System.out.println(s1.indexOf('t')); // 8
		System.out.println(s1.lastIndexOf('t'));  // 11
		System.out.println(s1.indexOf('t' , 9)); // 11
		System.out.println(s1.lastIndexOf('t' , 8)); // 8
	}
}
