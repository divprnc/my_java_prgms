class HashCodeandReference 
{
	public static void main(String[] args) 
	{
		String s1 = "Hello";
		String s2 = new String(s1);
		String s3 = new String("Hello");
		System.out.println(s1.hashCode() + " " + s2.hashCode() + " " + s3.hashCode());
		System.out.println(System.identityHashCode(s1) + " " + System.identityHashCode(s2) + " " + System.identityHashCode(s3));
	}
}