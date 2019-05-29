class StringLiteralOperationTest 
{
	public static void main(String[] args) 
	{
		String s1 = "ab";
		String s2 = "bb";
		String s3 = s1 + s2;
		String s4 = "ab" + "x" + "y";
		String s5 = s1 + "x" + "y";
		String s6 = "x";
		String s7 = "abxy";
		System.out.println("s1: " + System.identityHashCode(s1));
		System.out.println("s2: " + System.identityHashCode(s2));
		System.out.println("s3: " + System.identityHashCode(s3));
		System.out.println("s4: " + System.identityHashCode(s4));
		System.out.println("s5: " + System.identityHashCode(s5));
		System.out.println("s6: " + System.identityHashCode(s6));
		System.out.println("s7: " + System.identityHashCode(s7));
	}
}