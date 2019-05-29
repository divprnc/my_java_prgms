class StringInitialize 
{
	public static void main(String[] args) 
	{
		StringInitialize si = new StringInitialize();
		System.out.println(si);
		System.out.println(si.hashCode());
		System.out.println(System.identityHashCode(si));
	}
}