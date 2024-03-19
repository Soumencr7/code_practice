package abstraction_interface;

interface i1
{
    public void show();

}
interface i2
{
    public void display();
}
class test implements i1,i2
{
    @Override
    public void show()
    {
        System.out.println("1");
    }

    @Override
    public void display()
    {
        System.out.println("2");
    }

    public static void main(String[] args)
    {
        test t=new test();
        t.show();
        t.display();
    }
}
