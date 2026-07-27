class p12 {
    int id;
    String name;

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        p12 s1 = new p12();   // object creation

        s1.id = 1;
        s1.name = "hardik & madher";

        s1.display();
    }
}
