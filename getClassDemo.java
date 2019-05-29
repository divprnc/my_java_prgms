class getClassDemo 
{
	public String A()
	{
		return getClass().getName() + "@" + Integer.toHexString(hashCode());
	}
	public static void main(String[] args) 
	{
		getClassDemo cd = new getClassDemo();
		System.out.println(cd.A());
		System.out.println(cd);
		System.out.println(cd.hashCode());
		System.out.println(Integer.toHexString(cd.hashCode()));
	}
}
