package this_keyword;

import java.sql.SQLOutput;

public class ThisDemo
{
    void Display()
    {
        System.out.println("hello");
    }
        void show()
        {
           this.Display();//we write Display(); but compiler automatically add this.Display();
        }

    public static void main(String[] args) {
        ThisDemo td=new ThisDemo();
        td.show();
    }
}

