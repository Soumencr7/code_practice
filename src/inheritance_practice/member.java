package inheritance_practice;

public class member {
    String name;
    int age;
    double PhoneNo;
    String Address;
    double Salary;
    void printSalary()
    {
        System.out.println("Salary of the member");
    }

}
class Employee extends member
{
    String specialization;
    String department;

}
class Maneger extends member {
    String specialization;
    String department;


    public static void main(String[] args) {
        Employee tt=new Employee();
        

    }
}
