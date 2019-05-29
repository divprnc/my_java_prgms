class A
{
	static void m1()
	{
		System.out.println("A:m1()");
	}
}
class B extends A
{
	static void m1()
	{
		System.out.println("B:m1()");
	}
}
class MethodHidingDemo1 
{
	public static void main(String[] args) 
	{
		B b = new B();
		 b.m1();
	}
}