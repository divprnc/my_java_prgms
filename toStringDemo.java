class toStringDemo 
{
	private int rno;
	private String name;
	toStringDemo(int rno, String name)
	{
		this.rno = rno;
		this.name = name;
	}
	public String toString()
	{
		return rno + " " + name;
	}
	public static void main(String args[])
	{
		toStringDemo sd = new toStringDemo(101,"Ashu");
		System.out.println(sd);
	}
}
