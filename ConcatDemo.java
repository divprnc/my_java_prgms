class ConcatDemo 
{
	public static void main(String[] args) 
	{
		String s1 = "Hello";
		String s2 = s1.concat(" World");
		System.out.println(s2); // Hello World
		String s3 = s1 + " World";
		System.out.println(s3); // Hello World
	}
}