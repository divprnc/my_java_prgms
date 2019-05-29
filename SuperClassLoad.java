class Super
{
	static
	{
		System.out.println("Super class Loaded");
	}
}
class Subclass extends Super
{
	static
	{
		System.out.println("Subclass 1 loaded");
	}
}
class SuperClassLoad extends Subclass 
{
	static
	{
		System.out.println("Sub class loaded");
	}
	public static void main(String args[])
	{}
}