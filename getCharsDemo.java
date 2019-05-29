class getCharsDemo 
{
	public static void main(String[] args) 
	{
		String s1 = "Master in Computer Applications";
		int start = 10;
		int end = 15;
		char[] s = new char[end - start];
		s1.getChars(start , end , s , 1);
		System.out.println(s);
	}
}