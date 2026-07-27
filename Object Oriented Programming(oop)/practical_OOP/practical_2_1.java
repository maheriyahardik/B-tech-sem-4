// EXPERIMENT NO: 2 
// Title :- Introduction to Methods and Arrays 
 
// AIM : Write a method to enter two integers and compute 
// the GCD of two integers. 
import java.util.Scanner; 
 
 
public class practical_2_1 { 
public static void main(String[] args) { 
int a, b, gcd = 0; 
Scanner sc = new Scanner(System.in); 
System.out.print("Enter the First Number: "); 
a = sc.nextInt(); 
System.out.print("Enter the Second Number: "); 
b = sc.nextInt(); 
gcd = findGCD(a, b); 
System.out.println("GCD of " + a + " and " + b + " = " + gcd); 
sc.close();
} 

public static int findGCD(int a, int b) { 
while (b != 0) { 
if (a > b) { 
a = a - b; 
} else { 
b = b - a; 
 
} 
} 

return a; 
} 
} 
// Enter the First Number: 06
// Enter the Second Number: 26
// GCD of 6 and 26 = 2