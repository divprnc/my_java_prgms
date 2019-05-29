class DoubleNaNDemo 
{
	public static void main(String[] args) 
	{
		Double a = new Double(NaN);
		Double b = new Double(NaN);
		if ( a == b)
		{
			System.out.println("Equal");
		}
	}
}
