// AIM : Write a test program that prompts the user to enter 
// ten numbers, invoke a method to reverse the numbers, 
// display the numbers. 
class practical_2_2 { 
public static void main(String args[]) {  
int a[] = { 1,2,3 }; 
for (int i = 0; i < a.length; i++) 
System.out.println(a[i]); 
System.out.println("the array is written in reverse order"); 
for (int i = a.length - 1; i >= 0; i--) 
System.out.println(a[i]); 
} 
} 
// 1
// 2
// 3
// the array is written in reverse order
// 3
// 2
// 1
