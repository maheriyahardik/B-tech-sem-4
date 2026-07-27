import java.util.Scanner;

class ArmstrongAnyDigit {
    public static void main(String[] args) {
        int n, temp, rem, sum = 0, digits = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = sc.nextInt();
        sc.close();

        temp = n;
        int t = n;

        while (t != 0) {
            digits++;
            t = t / 10;
        }

        while (n != 0) {
            rem = n % 10;
            sum += Math.pow(rem, digits);
            n = n / 10;
        }

        if (temp == sum)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }
    
}
