class GCTest 
{
	public static void main(String[] args) 
	{
		String s1 = "a";
		String s2 = new String(s1);
		System.out.println("s1: " + System.identityHashCode(s1));
		System.out.println("s2: " + System.identityHashCode(s2));
		s1 = null;
		s2 = null;
		String s3 = "a";
		System.out.println("s3: " + System.identityHashCode(s3));
	}
}