// AIM : The employee list for a company contains employee 
// code, name, designation and basic pay. The employee is 
// given HRA of 10% of the basic and DA of 45% of the basic 
// pay. The total pay of the employee is calculated as Basic pay 
// + HRA + DA. Write a class to define the details of the 
// employee. Write a constructor to assign the required initial 
// values. Add a method to calculate HRA, DA and Total pay and 
// print them out. Write another class with a main method. 
// Create objects for three different employees and calculate 
// the HRA, DA and total pay.
import java.util.*;

class detail {

    double ep_code;
    String name;
    String designation;
    double basic, total;

    detail(double e, String n, String d, double b) {
        ep_code = e;
        name = n;
        designation = d;
        basic = b;
    }

    void cal() {
        double hra, da;
        hra = basic * 0.1;
        da = basic * 0.45;
        total = basic + hra + da;
    }

    void display() {
        System.out.println("Employee Code : " + ep_code);
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Designation : " + designation);
        System.out.println("Employee Total Salary : " + total);
        System.out.println("----------------------------------");
    }
}

public class practical_3_2 {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);


        for (int i = 0; i < 3; i++) {

            System.out.println("Enter the employee Code : ");
            double ep_code = input.nextDouble();

            System.out.println("Enter the employee name:");
            String name = input.next();

            System.out.println("Enter the employee designation:");
            String designation = input.next();

            System.out.println("Enter the employee Basic pay:");
            double basic = input.nextDouble();

            detail obj = new detail(ep_code, name, designation, basic);
            obj.cal();
            obj.display();
        }

        input.close();
    }
}
// Enter the employee Code : 
// 16
// Enter the employee name:
// hardik
// Enter the employee designation:
// CEO
// Enter the employee Basic pay:
// 25000
// Employee Code : 16.0
// Employee Name : hardik
// Employee Designation : CEO
// Employee Total Salary : 38750.0
// ----------------------------------
// Enter the employee Code :
// 4
// Enter the employee name:
// keyur
// Enter the employee designation:
// CTO
// Enter the employee Basic pay:
// 30000
// Employee Code : 4.0
// Employee Name : keyur
// Employee Designation : CTO
// Employee Total Salary : 46500.0
// ----------------------------------
// Enter the employee Code :
// 5
// Enter the employee name:
// shivam
// Enter the employee designation:
// CFO
// Enter the employee Basic pay:
// 35000
// Employee Code : 5.0
// Employee Name : shivam
// Employee Designation : CFO
// Employee Total Salary : 54250.0
// ----------------------------------