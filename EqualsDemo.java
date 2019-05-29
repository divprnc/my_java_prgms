class EqualsDemo
{
	int x;
	EqualsDemo(int x)
	{
		this.x = x;
	}
	public static void main(String[] args)
	{
		EqualsDemo ed1 = new EqualsDemo(101);
		EqualsDemo ed2 = new EqualsDemo(101);
		System.out.println(ed1.equals(ed2)); // false
	}
}