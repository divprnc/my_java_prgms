class CloningTest implements Cloneable
{
	int x = 10, y = 20;
	public CloningTest clone() throws CloneNotSupportedException
	{
		return (CloningTest)super.clone();
	}
}
class Cloning1
{
	public static void main(String args[]) throws CloneNotSupportedException
	{
		CloningTest ct1 = new CloningTest();
		CloningTest ct2 = ct1.clone();
		System.out.println(ct1 + " " + ct1.x + " " + ct1.y);
		System.out.println(ct2 + " " + ct2.x + " " + ct2.y);
	}
}