class A
{
	public static void main(String args[])
	{
		System.out.println("A main");
	}
}
class MainOverride extends A
{
	public static void main(String[] args) 
	{
		A.main(new String[0]);
		System.out.println("MainOverride main");
	}
}
