class HashCode 
{
	public static void main(String[] args) 
	{
		String s1 = "a";
		String s2 = new String("a");
		String s3 = s2;
		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // true
		System.out.println(s2 == s3); // true
		System.out.println(s2.equals(s3)); // true
	}
}
