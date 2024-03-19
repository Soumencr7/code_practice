package Method_overriding;

public class HYZ
{
    Object show()
    {
        System.out.println("1");
        return null;
    }
}
    class JKL extends HYZ
    {
        String show()
        {
            System.out.println("2");
            return null;
        }
            public static void main(String[]args)
            {
                HYZ p=new HYZ();
                p.show();
                 JKL q=new JKL();
                 q.show();
            }
    }
