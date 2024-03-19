package Method_overriding;

public class Test {
    void show(String a,int b)
    {
        System.out.println("1");
    }
}
    class XYZ extends Test
    {
    void show(String a,int b)
    {
        System.out.println("2");
    }
        public static void main(String[]args)
        {
            Test t=new Test();
            t.show("faruk",420);
            XYZ x=new XYZ();
            x.show("sagar",100);
        }

    }
