//package ashu.project;
class A{}
class B{}
class C
{
    A a1 = new A();
}
public class IsACloning1 extends C implements Cloneable 
{
    B b1 = new B();
    public static void main(String args[]) throws CloneNotSupportedException
    {
        IsACloning1 i1 = new IsACloning1();
        IsACloning1 i2 = (IsACloning1)i1.clone();
        System.out.println(i1.a1 == i2.a1); // true
        System.out.println(i1.b1 == i2.b1); // true
        i1.a1 = new A();
        i1.b1 = new B();
        System.out.println(i1.a1 == i2.a1); // false
        System.out.println(i1.b1 == i2.b1); // false
    }
}
