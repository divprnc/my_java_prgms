class PrintChar 
{
	public static void main(String[] args) 
	{
		String s = "abc";
		for(int i = 0;i <=s.length(); i++)
			System.out.println("Character at position "+ (i+1) +": " + s.charAt(i));
	}
}