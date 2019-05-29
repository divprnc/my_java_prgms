enum Apple
{
	Jonathan , RedDel , GoldenDel , Winesap , CortLand;
}
class EnumDemo1 
{
	public static void main(String[] args) 
	{
		System.out.println("Here is the list of Apples");
		Apple apples[] = Apple.values();
		for ( Apple ap : apples)
			System.out.println(ap);
		System.out.println();
		Apple ap = Apple.valueOf("Winesap");
		System.out.println(ap);
	}
}