package super_keyword;

public class A
{
    int i=10;
}
    class B extends A
    {
        int i=20;
        void show(int i)
        {
            System.out.println(super.i);
        }

        public static void main(String[] args) {
            B ob=new B();
            ob.show(30);
        }
    }
