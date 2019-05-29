class StringLiteralGC 
{
	public static void main(String[] args) 
	{
		String s1 = "a";
		String s2 = "b";
		String s3 = "a";
		String s4 = new String("c");
		String s5 = new String("c");
		String s6 = new String("C");
		String s7 = s4;
		s1 = null;
		s2 = null;
		s4 = null;
		s5 = null;
	}
}