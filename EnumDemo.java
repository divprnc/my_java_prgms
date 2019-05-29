enum Apple
{
	Jonathan, GoldenDel, RedDel, Winesap, CortLand;
}
class EnumDemo 
{
	public static void main(String[] args) 
	{
		Apple ap;
		ap = Apple.RedDel;
		System.out.println("ap is of type: " + ap);
		ap = Apple.Jonathan;
		if ( ap == Apple.Jonathan)
			System.out.println("ap is of Jonathan type");
		switch ( ap )
		{
		case Jonathan:
			System.out.println("Jonathan is yellow");
			break;
		case GoldenDel:
			System.out.println("GoldenDel is red");
			break;
		case RedDel:
			System.out.println("RedDel is red");
			break;
		case Winesap:
			System.out.println("Winesap is red");
			break;
		case CortLand:
			System.out.println("CortLand is red");
		}
	}
}
