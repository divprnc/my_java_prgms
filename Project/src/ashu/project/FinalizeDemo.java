package ashu.project;
class Furniture{}
class Building
{
    Furniture f = new Furniture();
    Building(Furniture f)
    {
        this.f = f;
    }
    void display()
    {
        System.out.println(f);
    }
    @Override
    public void finalize()
    {
        f = null;
        display();
    }
}
public class FinalizeDemo 
{
    public static void main(String args[]) throws Exception
    {
        for(int i = 1; i<=2; i++)
        {
            Building building = new Building(new Furniture());
            building.display();
        }
        System.gc();
    }
}
