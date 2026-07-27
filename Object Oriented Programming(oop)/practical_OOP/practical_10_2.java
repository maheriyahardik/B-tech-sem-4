 // AIM : Write the program for factorial using the concept of 
// recursion.
import java.io.*;

class factorial {

    public int fact(int n) {

        if (n < 0) {
            System.out.println("Negative number not allowed in factorial function.");
            return -1;
        }

        if (n == 0) {
            return 1;
        }

        return n * fact(n - 1);
    }
}

public class practical_10_2 {

    public static void main(String[] args) throws IOException {

        factorial f = new factorial();

        System.out.println("\nProgram for finding the factorial of n.");
        System.out.print("\nEnter the number: ");

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(buff.readLine());

        System.out.println("\nThe Factorial of " + n + " is: " + f.fact(n));
    }
}
// Program for finding the factorial of n.
// Enter the number: 8
// The Factorial of 8 is: 40320