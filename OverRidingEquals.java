class OverRidingEquals
{
	public static void main(String args[])
	{
		Student s1 = new Student(101, "Ashu");
		Student s2 = new Student(102, "Akash");
		System.out.println(s1.A());
		System.out.println(s1.hashCode());
	}
}