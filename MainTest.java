class MainParent
{
	static int x = m1();
	int y = m2();
	MainParent()
	{
		System.out.println("Constructor of the Parent class");
	}
	static int m1()
	{
		System.out.println("Static Function m1()");
		return 10;
	}
	{
		System.out.println("Non Static Block");
	}
	static
	{
		System.out.println("Static Block");
	}
	int m2()
	{
		System.out.println("Non Static Function m2()");
		return 20;
	}
}
class MainTest extends MainParent
{
	static int x = m3();
	int y = m4();
	MainTest()
	{
		System.out.println("Constructor of the child class");
	}
	static int m3()
	{
		System.out.println("Static Function m3()");
		return 10;
	}
	{
		System.out.println("Non Static Block");
	}
	static
	{
		System.out.println("Static Block");
	}
	int m4()
	{
		System.out.println("Non Static Function m4()");
		return 20;
	}
	public static void main(String args[])
	{
		System.out.println("Inside Main");
		MainTest mt = new MainTest();
		System.out.println("x: " + x);
		System.out.println("y: " + mt.y);
	}
}