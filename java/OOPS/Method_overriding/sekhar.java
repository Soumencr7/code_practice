package Method_overriding;

public class sekhar
{
    void show()
    {
        System.out.println("1");
    }

}
class Bijay extends sekhar
{
    @Override
    void show()
    {
        super.show();
        System.out.println("2");
    }

    public static void main(String[] args) {
        Bijay ob=new Bijay();
        ob.show();
    }
}

