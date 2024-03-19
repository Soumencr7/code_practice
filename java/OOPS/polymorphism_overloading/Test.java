package polymorphism_overloading;

//no of argument
public class Test
{
    void show()
        {
            System.out.println("1");
        }
    void show(int a,int b)
        {
            System.out.println("2");
        }
   public static void main(String[]args)
   {
       Test tt=new Test();
       tt.show(10,20);
   }


}
