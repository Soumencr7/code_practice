package constructor;

public class employee {
    String name;
    int emp_id;

    employee(String name, int emp_id) {
        this.name = name;
        this.emp_id = emp_id;
    }

    public static void main(String[] args) {

        employee e1 = new employee("sagar", 101);
        employee e2 = new employee("sanjit", 102);
        System.out.println("employee 1 : " + e1.name + " " + e1.emp_id);
        System.out.println("employee 2 : " + e2.name + " " + e2.emp_id);
    }

}
