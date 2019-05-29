class StartsWithEndsWithDemo 
{
	public static void main(String[] args) 
	{
		String s1 = "Hello";
		boolean b1 = s1.startsWith("Hel");  // true
		boolean b2 = s1.endsWith("llo");  // true
		System.out.println(b1 + " " + b2);
		boolean b3 = s1.startsWith("llo"); // false
		boolean b4 = s1.endsWith("Hel"); // false
		System.out.println(b3 + " " + b4);
	}
}
