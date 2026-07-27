// 8. To Understand concept of interface. 
// 1. Write a program that illustrates interface 
// inheritance. Interface A is extended by A1 
// and A2. Interface A12 inherits from both 
// P1 and P2. Each interface declares one 
// constant and one method. Class B 
// implements A12.Instantiate B and invoke 
//each of its methods. Each 
// 8. To Understand concept of interface inheritance

interface A {
    int a = 5;
    void dispP();
}

interface A1 extends A {
    int a1 = 10;
    void dispP1();
}

interface A2 extends A {
    int a2 = 20;
    void dispP2();
}

interface A12 extends A1, A2 {
    int a12 = 12;
    void dispP12();
}

class B implements A12 {

    public void dispP() {
        System.out.println("dispP : " + a);
    }

    public void dispP1() {
        System.out.println("dispP1 : " + a1);
    }

    public void dispP2() {
        System.out.println("dispP2 : " + a2);
    }

    public void dispP12() {
        System.out.println("dispP12 : " + a12);
    }
}

public class practical_8_1 {
    public static void main(String arg[]) {

      
        B q = new B();
        q.dispP();
        q.dispP1();
        q.dispP2();
        q.dispP12();
    }
}
// dispP : 5
// dispP1 : 10
// dispP2 : 20
// dispP12 : 12