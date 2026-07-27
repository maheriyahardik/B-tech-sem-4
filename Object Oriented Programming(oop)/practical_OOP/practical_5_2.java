// Write a program to illustrate the concept of Single 
// inheritance. 
class A {
    int a;

    void set_a(int i) {
        a = i;
    }

    void show_a() {
        System.out.println("The value of a = " + a);
    }
}

class B extends A {
    int b;

    void set_b(int i) {
        b = i;
    }

    void show_b() {
        System.out.println("The value of b = " + b);
    }

    void mul() {
        int c;
        c = a * b;
        System.out.println("The value of c = " + c);
    }
}

public class practical_5_2 {

    public static void main(String args[]) {
        B obj_B = new B();

        obj_B.set_a(10);
        obj_B.set_b(20);
        
        obj_B.show_a();
        obj_B.show_b();
        obj_B.mul();
    }
}
// The value of a = 10
// The value of b = 20
// The value of c = 200