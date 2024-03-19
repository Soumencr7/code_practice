package Method_overriding;

public class sagar
{
    void show()
    {
        System.out.println("1");
    }
}
    class pritam extends sagar
    {
      public void show()
        {
            System.out.println("2");
        }

        public static void main(String[] args) {
            sagar R=new sagar();
            R.show();
            pritam G=new pritam();
            G.show();
        }
    }
