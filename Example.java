class Example implements Cloneable
{
	int x = 10, y = 20;
	public Example clone() throws CloneNotSupportedException
	{
		return (Example)super.clone();
	}
}