class RegionMatchesDemo 
{
	public static void main(String[] args) 
	{
		String s1 = "Hello";
		String s2 = "Hello";
		boolean ignoreCase = true;
		System.out.println(s1.regionMatches(ignoreCase , 1 , s2 , 1 , 4));
	}
}