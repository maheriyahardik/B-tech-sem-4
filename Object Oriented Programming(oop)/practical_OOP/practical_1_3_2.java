// Code : 2. Nested if
import java.util.*; 
public class practical_1_3_2 { 
 
public static void main(String[] args) { 
Scanner input = new Scanner(System.in); 
 
double n1 ,n2, n3; 
System.out.println("enter 1st number "); 
n1 = input.nextInt(); 
System.out.println("enter 2nd number "); 
n2 = input.nextInt(); 
System.out.println("enter 3rd number "); 
n3 = input.nextInt(); 
if( n1 >= n2 && n1 >= n3) 
System.out.println(n1 + " is the largest number."); 
 
else if (n2 >= n1 && n2 >= n3) 
System.out.println(n2 + " is the largest number."); 
 
else 
System.out.println(n3 + " is the large  st number."); 
input.close();
} 
 
} 
// enter 1st number 
// 06
// enter 2nd number 
// 26
// enter 3rd number 
// 05
// 26.0 is the largest number.
