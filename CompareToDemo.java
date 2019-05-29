class CompareToDemo 
{
	public static void main(String[] args) 
	{
		String s1 = "hello";
		String s2 = "Hello";
		System.out.println(s1.compareTo(s2));  // 32
		System.out.println(s1.compareToIgnoreCase(s2));  // 0
		String s3 = "World";
		System.out.println(s2.compareTo(s3)); // -15
	}
}
