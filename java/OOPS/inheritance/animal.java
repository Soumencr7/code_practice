class dog {
    void eat() {
        System.out.println("i am eating");
    }

}

class animal extends dog {
    public static void main(String[] args) {
        animal d = new animal();
        d.eat();
    }
}