package polymorphism_overloading;
//seq of argument
public class Main {
    void show(int a,String b)
    {
        System.out.println("1");
    }
    void show(String a,int b)
    {
        System.out.println("2");
    }
    public static void main(String[]args)
    {
        Main tt=new Main();
        tt.show("sagar",10);
    }

}

