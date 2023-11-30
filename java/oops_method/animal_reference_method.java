package oops_method;

public class animal_reference_method {
    String color;
    int age;

    void initobj(String c, int a) {
        color = c;
        age = a;
    }

    void display() {
        System.out.println(color + " " + age);
    }

    public static void main(String[] args) {
        animal_reference_method buzo = new animal_reference_method();
        buzo.initobj("black", 10);
        buzo.display();
    }

}
