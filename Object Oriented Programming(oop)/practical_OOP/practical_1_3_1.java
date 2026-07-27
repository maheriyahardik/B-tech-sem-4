// AIM : Write a program to find a greater number among given 
// three numbers using a) ternary operator and b)nested if. 
// Code : 1 . ternary operator 
import java.util.Scanner; 
public class practical_1_3_1 { 
public static void main(String[] args) { 
int a, b, c, d; 
Scanner s = new Scanner(System.in);  
System.out.println("Enter all three numbers:"); 
a = s.nextInt(); 
b = s.nextInt(); 
c = s.nextInt(); 
d = c > (a > b ? a : b) ? c : ((a > b) ? a : b); 
System.out.println("Largest Number:" + d); 
s.close();
} 
} 
// Enter all three numbers:
// 26
// 06
// 28
// Largest Number:28