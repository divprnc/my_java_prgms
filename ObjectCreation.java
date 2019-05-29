class ObjectCreation 
{
	public static void main(String[] args) 
	{
		String s1 = "a";
		System.out.println("s1: " + System.identityHashCode(s1));
		String s2 = "a";
		System.out.println("s2: " + System.identityHashCode(s2));
		String s3 = s1;		
		System.out.println("s3: " + System.identityHashCode(s3));
		String s4 = new String("a");
		System.out.println("s4: " + System.identityHashCode(s4));
		String s5 = new String("b");
		System.out.println("s5: " + System.identityHashCode(s5));
		String s6 = "ab";
		System.out.println("s6: " + System.identityHashCode(s6));
		String s7 = "a" + "b";
		System.out.println("s7: " + System.identityHashCode(s7));
		String s8 = s1 + "b";
		System.out.println("s8: " + System.identityHashCode(s8));
		String s9 = "a";
		System.out.println("s9: " + System.identityHashCode(s9));
		String s10 = s1.concat("b");
		System.out.println("s10: " + System.identityHashCode(s10));
		String s11 = s10.concat("");
		System.out.println("s11: " + System.identityHashCode(s11));
	}
}