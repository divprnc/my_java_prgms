class A
{
	void m1(float a)
	{
		System.out.println("Integer Arguement");
	}
}
class B extends A
{
	void m1(int b)
	{
		System.out.println("Float Argument");
	}
}
class ReferenceTypeWidening
{
	public static void main(String args[])
	{
		A a = new A();
		a.m1(50L);
	}
}