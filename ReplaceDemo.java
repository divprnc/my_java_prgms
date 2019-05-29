class ReplaceDemo 
{
	public static void main(String[] args) 
	{
		String s1 = "Hello World";
		s1 = s1.replace('l' , 'u');
		System.out.println(s1); // Heuuo Worud
		s1 = s1.replace("Worud","Java");
		System.out.println(s1); // Heuuo Java
	}
}