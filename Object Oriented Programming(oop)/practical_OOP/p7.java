import static java.lang.System.in;

import java.util.Scanner;

public  class p7 {
    public static void main(String[] args){
        int n = 0,rev=0,temp,rem;
        Scanner sc= new Scanner (in);
        System.out.println("Enter a number:");
        n = sc.nextInt();
        temp=n;
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(temp == rev){
            System.out.println("Number is palindrome;");
        }
        else{
            System.out.println("Number is not palindrome");
        }
        sc.close();
    }
}
