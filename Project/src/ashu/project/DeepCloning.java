package ashu.project;
public class DeepCloning implements Cloneable
{
    int stuNo = 1;
    String name = "StudentOne";
    String course = "Course1";
    double fee = 1000;
    Address add = new Address();
    @Override
    public DeepCloning clone() throws CloneNotSupportedException
    {
        DeepCloning s = (DeepCloning)super.clone();
        s.add = add.clone();
        return s;
    }
    public static void main(String args[]) throws CloneNotSupportedException
    {
        DeepCloning d1 = new DeepCloning();
        DeepCloning d2 = d1.clone();
        System.out.println(d1.add == d2.add);
    }
}