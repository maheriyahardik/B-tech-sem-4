// Title :- Introduction to class, object and constructor 
 
// AIM : Write a program that declares a class named Person. 
// It should have instance variables to record name, age and 
// salary. Use new operator to create a Person object. Set and 
// display its instance variables. Add a constructor to the 
// Person class developed above.
import java.util.*;

class person {
    String name;
    int age;
    int salary;

    person(String n, int a, int s) {
        name = n;
        age = a;
        salary = s;
    }

    void display() {
        System.out.println("");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
    }
}

class practical_3_1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name :");
        String name = input.next();

        System.out.println("Enter salary :");
        int salary = input.nextInt();

        System.out.println("Enter age :");
        int age = input.nextInt();

        person obj = new person(name, age, salary);
        obj.display();

        input.close();
    }
}
//Enter name :
//hardik
//Enter salary :
//50000
//Enter age :
//19

//Name: hardik
//Salary: 50000
//Age: 19