class test 
{
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Example e1 = new Example();
		Example e2 = e1.clone();
		System.out.println(e1);
		System.out.println(e2);
	}
}