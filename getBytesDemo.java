class getBytesDemo 
{
	public static void main(String[] args) 
	{
		String s1 = "A";
		byte[] b = s1.getBytes();
		System.out.println(toString("10"));
		System.out.println(System.identityHashCode(s1));
	}
}