class Super
{
	static int a = 10;
	static void m1()
	{
		System.out.println("Static Method m1() of Super");
	}
	void m2()
	{
		System.out.println("Non Static Method m2() of Super");
	}
	void m3()
	{
		System.out.println("Non Static Method m3() of Super");
	}
}
class SuperDemo extends Super
{
	static int a = 20;
	static void m1()
	{
		// super.m1();
		System.out.println("Static Method m1() of SuperDemo");
	}
	void m2()
	{
		super.m2();
		System.out.println("Non Static Method m2() of SuperDemo");
	}
	void printA()
	{
		System.out.println("Super a: " + super.a);
		System.out.println("SuperDemo a: " + a);
	}
	public static void main(String[] args) 
	{
		SuperDemo sd = new SuperDemo();
		m1();
		sd.m2();
		sd.m3();
		sd.printA();
	}
}