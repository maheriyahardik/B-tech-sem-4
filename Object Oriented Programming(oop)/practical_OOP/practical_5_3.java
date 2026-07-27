//3. Write a program to illustrate the concept 
//of Multi level inheritance
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
}

class C extends B {
    int c;

    void set_c(int i) {
        c = i;
    }

    void show_c() {
        System.out.println("The value of c = " + c);
    }

    void mul() {
        int ans = a * b * c;
        System.out.println("The value of ans = " + ans);
    }
}

class practical_5_3 {
    public static void main(String args[]) {

        C obj = new C();

        obj.set_a(10);
        obj.set_b(20);
        obj.set_c(30);

        obj.show_a();
        obj.show_b();
        obj.show_c();
        obj.mul();
    }
}
// The value of a = 10
// The value of b = 20
// The value of c = 30
// The value of ans = 6000