// Inheritance and Polymorphism 
 
// AIM : Write a program to illustrate the concept of class with 
// Method overloading. 
public class practical_5_1 {
    public static void main(String args[]) {
        System.out.println("Sum of two integers");
        Sum(10, 20);

        System.out.println("Sum of two double numbers");
        Sum(10.5, 20.4);

        System.out.println("Sum of three integers");
        Sum(10, 20, 30);
    }
    
    public static void Sum(int num1, int num2) {
        int ans;
        ans = num1 + num2;
        System.out.println(ans);
    }

    public static void Sum(double num1, double num2) {
        double ans;
        ans = num1 + num2;
        System.out.println(ans);
    }

    public static void Sum(int num1, int num2, int num3) {
        int ans;
        ans = num1 + num2 + num3;
        System.out.println(ans);
    }
}
// Sum of two integers
// 30
// Sum of two double numbers
// 30.9
// Sum of three integers
// 60