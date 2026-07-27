import java.util.Scanner;

public class p3 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Check whether a number is Odd or Even:");

        System.out.print("Enter a number: ");
        int number = s.nextInt();

        if (number % 2 == 0)
        {
            System.out.println(number + " is Even");
        } else
        {
            System.out.println(number + " is Odd");
        }
        s.close();
    }
}
