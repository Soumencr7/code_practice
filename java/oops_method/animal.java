package oops_method;

public class animal {
    public void eat() {
        System.out.println("i am eating");
    }

    public static void main(String[] args) {
        System.out.println("1");
        animal cat = new animal();
        cat.eat();
        cat.run();

        animal aa = new animal();
        aa.run();
        aa.eat();
    }

    public void run() {
        System.out.println("i am running");
    }

}
