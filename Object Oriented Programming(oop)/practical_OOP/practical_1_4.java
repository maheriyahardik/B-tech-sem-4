// AIM : Write a program to print the Fibonacci series 
// Code :Fibonacci series 
import java.util.*; 
 
public class practical_1_4 { 
public static void main(String args[]) { 
 
 
int n1 = 0, n2 = 1, i, n, n3; 
Scanner input = new Scanner(System.in); 
System.out.println("Enter the number"); 
n = input.nextInt(); 
System.out.print(n1); 
System.out.print(" " + n2); 
for (i = 0; i < n; i++) { 
n3 = n1 + n2; 
System.out.print(" " + n3); 
 
 
n1 = n2; 
n2 = n3; 
} 
input.close();
} 
} 
// Enter the number
// 5
// 0 1 1 2 3 5 8