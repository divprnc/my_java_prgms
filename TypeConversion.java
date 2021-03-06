class A
{
	int a = 10;
}
class B extends A
{
	int a = 20;
}
class C extends B
{}
class D
{}
class TypeConversion 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		B b1 = new B();
		C c1 = new C();
		D d1 = new D();
		System.out.println("a1 instanceof B: " + (a1 instanceof B));
		System.out.println("b1 instanceof A: " + (b1 instanceof A));
		System.out.println("b1 instanceof C: " + (b1 instanceof C));
		System.out.println("c1 instanceof B: " + (c1 instanceof B));
		// System.out.println("c1 instanceof D: " + (c1 instanceof D)); inheritace relationship required

		// upcasting --> storing subclass object reference into superclass reference variable
		A a2 = new B();
		B b2 = new C();
		// B b3 = new A(); CE: incompatible types

		// Down Casting --> storing superclass reference variable to subclass reference variable
		B b3 = (B) a2; 
		if (a1 instanceof B)
		{
			B b4 = (B) a1;
		}

		// Dynamic Method Dispatch
		System.out.println("a1.a: " + a1.a);
		System.out.println("a2.a: " + a2.a);
		System.out.println("b1.a: " + b1.a);
	}
}