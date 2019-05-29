class Example
{
	int x = 10;
	int y = 20;
}
class Test
{}
class Comparision 
{
	public static void main(String[] args) 
	{
		/*
		int x = 10;
		int y = 20;
		int z = 30;
		System.out.println(x == y); // false
		System.out.println(x == z); // false
		boolean bo = true;
		// System.out.println(x == bo);  CE: incomparable types: int and boolean
		
		Example e1 = new Example();
		Example e2 = new Example();
		Example e3 = e2;
		System.out.println(e1 + " " + e2 + " " + e3);
		System.out.println("e1 == e2: " + (e1 == e2)); // false
		System.out.println("e2 == e3 :" + (e2 == e3)); // true
		
		// We cannot use == operator to compare incompatible reference types
		Test t1 = new Test();
		// System.out.println(e1 == t1);  CE: incomparable types: Example and Test
		// equals() method returns false for incompatible types comparision
		System.out.println(e1.equals(t1)); // false
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		Integer i3 = i2;
		System.out.println("i1 == i2: " + (i1 == i2)); // false
		System.out.println("i2 == i3 :" + (i2 == i3)); // true
		System.out.println("i1.equals(i2): " + (i1.equals(i2))); // true
		System.out.println("i2.equals(i3) :" + (i2.equals(i3))); // true
		*/

		System.out.println(null == null); // true
		Example e4 = null;
		System.out.println(e4 == null); // true
		Example e5 = new Example();
		System.out.println(e5 == null); // false
		// System.out.println(null.equals(null));  CE: <null> cannot be dereferenced
		// System.out.println(e4.equals(null)); RE: NullPointerException
		System.out.println(e5.equals(null)); // false
	}
}