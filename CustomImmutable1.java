// developing immutable object that does not allow modifications
class Sample
{
	private int x;
	public Sample(int x)
	{
		this.x = x;
	}
	public int getX()
	{
		return x;
	}
}
class CustomImmutable1 
{
	public static void main(String[] args) 
	{
		Sample s = new Sample(15);
		System.out.println(s.getX());
		//s.x = 20;
	}
}