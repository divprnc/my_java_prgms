class TrimDemo 
{
	public static void main(String[] args) 
	{
		String s1 = "      Hello World     ";
		System.out.println(s1);  //       Hello World
		System.out.println(s1.trim()); // Hello World
	}
}