abstract class Dimension
{
	double dim1, dim2;
	Dimension(double dim1, double dim2)
	{
		this.dim1 = dim1;
		this.dim2 = dim2;
	}
	abstract double area();
}
class Rectangle extends Dimension
{
	Rectangle(double a, double b)
	{
		super(a, b);
	}
	double area()
	{
		System.out.print("Area of Rectangle: ");
		return (dim1*dim2);
	}
}
class Triangle extends Dimension
{
	Triangle(double a, double b)
	{
		super(a, b);
	}
	double area()
	{
		System.out.print("Area of triangle: ");
		return (dim1*dim2)/2;
	}
}
class DynamicMethodDispatch 
{
	static void assign(Dimension d)
	{
		System.out.println(d.area());
	}
	public static void main(String[] args) 
	{
		assign(new Rectangle(10, 10));
		assign(new Triangle(10, 15));
	}
}