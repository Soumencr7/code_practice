package Encapsulation;

public class Emplyee
{
    private int emp_id;

    public void setEmp_id(int e_id)
    {
        emp_id = e_id;
    }

    public int getEmp_id() {
        return emp_id;
    }
}
    class company
    {
        public static void main(String[] args) {
            Emplyee e=new Emplyee();
            e.setEmp_id(101);
            System.out.println(e.getEmp_id());
        }
    }
