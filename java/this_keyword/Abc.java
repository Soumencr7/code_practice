package this_keyword;

public class Abc
{
    Abc()
    {
        System.out.println("no argument constructor");
    }
        Abc(int a)
        {
            this();
            System.out.println("parameterised constructor");
        }

    public static void main(String[] args) {
        Abc aa=new Abc(10);
    }
}
