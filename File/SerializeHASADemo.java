import java.io.*;
class Address
{
	String city;
	int pinCode;
	Address(String city, int pinCode)
	{
		this.city = city;
		this.pinCode = pinCode;
	}
}
class Student implements Serializable
{
	String name;
	int rollNo;
	transient Address add;
	static final long serialVersionUID = 41L;
	Student(String name, int rollNo, Address add)
	{
		this.name = name;
		this.rollNo = rollNo;
		this.add = add;
	}
	private void writeObject(ObjectOutputStream oos)
	{
		try
		{
			oos.defaultWriteObject();
			oos.writeUTF(add.city);
			oos.writeInt(add.pinCode);			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private void readObject(ObjectInputStream ois)
	{
		try
		{
			ois.defaultReadObject();
			String city = ois.readUTF();
			int pinCode = ois.readInt();
			add = new Address(city, pinCode);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public String toString()
	{
		return "Name: " + name + "\n" + 
					"Roll No.: " + rollNo + "\n" +
					"City: " + add.city + "\n" +
					"Pin Code: " + add.pinCode;
	}
}
class SerializeHASADemo
{
	public static void main(String args[])
	{
		try
		{
			Address add = new Address("Sasaram", 821115);
			Student stu = new Student("Ashu", 101, add);
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("SerializeHASADemo.ser"));
			oos.writeObject(stu);
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SerializeHASADemo.ser"));
			System.out.println(ois.readObject());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}