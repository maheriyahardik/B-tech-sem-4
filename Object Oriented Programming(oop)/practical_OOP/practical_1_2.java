// AIM : Write a program to find whether the number is prime 
// or not.
import java.util.*;

class practical_1_2 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int i, num;
        int flag = 1;   // assume number is prime

        System.out.print("Enter the number : ");
        num = input.nextInt();

        if (num <= 1) {
            flag = 0;
        } else {
            for (i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    flag = 0;
                    break;
                }
            }
        }

        if (flag == 1) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not Prime number");
        }

        input.close();
    }
}
// Enter the number : 11
// Prime number