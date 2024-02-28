package oops_method;

public class animal_refernce_variable {
    String color;
    int age;

    public static void main(String[] args) {
        animal_refernce_variable buzo = new animal_refernce_variable();
        buzo.color = "black";
        buzo.age = 10;
        System.out.println(buzo.color + " " + buzo.age);
    }
}
