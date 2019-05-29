// developing immutable object that allows modifications but result stored in new object
class Sample
{
	private int x;
	public Sample()
	{}
	public Sample(int x)
	{
		this.x = x;
	}
	public Sample setX(int x)
	{
		Sample s = new Sample();
		s.x = x;
		return s;
	}
	public int getX()
	{
		return x;
	}
}
class CustomImmutable2 
{
	public static void main(String[] args) 
	{
		Sample s1 = new Sample(10);
		System.out.println("s1: " + s1.getX());
		Sample s2 = s1.setX(15);
		System.out.println("After modification");
		System.out.println("s1: " + s1.getX());
		System.out.println("s2: " + s2.getX());
	}
}