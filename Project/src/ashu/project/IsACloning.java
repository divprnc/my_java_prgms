package ashu.project;
class A
{
    int p = 5;
}
class B extends A
{
    int q = 6;
}
class C extends B
{
    int r = 7;
}
public class IsACloning extends C implements Cloneable
{
    int s = 8;
    @Override
    public String toString()
    {
        return "p: " + p + "\n" + 
               "q: " + q + "\n" +
               "r: " + r + "\n" +
               "s: " + s;
    }
    public static void main(String args[]) throws CloneNotSupportedException
    {
        IsACloning i1 = new IsACloning();
        IsACloning i2 = (IsACloning)i1.clone();
        System.out.println("i1.......\n" + i1);
        System.out.println("i2.......\n" + i2);
        i2.p = 10;
        i2.q = 11;
        i2.r = 13;
        i2.s = 14;
        System.out.println("i1.......\n" + i1);
        System.out.println("i2.......\n" + i2);
    }
}