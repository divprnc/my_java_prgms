// String is immutable. Immutable means every string object is independent. Each time we modify a string it creates a new memory     space in memory.
class StringTest 
{
	int rollno;
	String name;
	StringTest(int rollno , String name)
	{
		this.rollno = rollno;
		this.name = name;
	}
	public String toString()
	{
		return rollno + " " + name;
	}
	public static void main(String[] args) 
	{
		StringTest st = new StringTest(101,"Ashu");
		System.out.println(st);
	}
}