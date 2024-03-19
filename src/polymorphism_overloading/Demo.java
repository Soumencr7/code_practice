package polymorphism_overloading;

public class Demo {
    void show(String b,int a )
    {
       System.out.println("1");
    }
        void show(int a)

        {
            System.out.println("2");
        }
            public static void main(String[]args)
            {
                Demo tt=new Demo();
                tt.show("sagar",10);
            }
}
