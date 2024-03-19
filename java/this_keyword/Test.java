package this_keyword;

public class Test
{
    int i;

    public void setValues(int i)
    {
        this.i = i;
    }
        void show()
        {
            System.out.println(i);
        }
}
    class xyz
    {
        public static void main(String[] args) {
            Test t=new Test();
            t.setValues(10);
            t.show();
        }
    }
    
