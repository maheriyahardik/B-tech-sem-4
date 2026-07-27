// Write a Java Program to Count the Occurrences of 
// Each Character in String 
public class practical_4_2 { 
static final int MAX_CHAR = 256; 
 
 
static void getOccuringChar(String str) { 
int count[] = new int[MAX_CHAR]; 
int len = str.length(); 
for (int i = 0; i < len; i++) 
count[str.charAt(i)]++; 
char ch[] = new char[str.length()]; 
for (int i = 0; i < len; i++) { 
ch[i] = str.charAt(i); 
int find = 0; 
for (int j = 0; j <= i; j++) { 
if (str.charAt(i) == ch[j]) 
find++; 
 
} 
if (find == 1) 
System.out.println("The occurrence of " + 
str.charAt(i) + " is: " + count[str.charAt(i)]); 
} 
 
} 
 
 
public static void main(String args[]) { 
 
String str = "abc xyz c "; 
System.out.println("string is " + str); 
getOccuringChar(str); 
} 
}
// string is abc xyz c 
// The occurrence of a is: 1
// The occurrence of b is: 1
// The occurrence of c is: 2
// The occurrence of   is: 3
// The occurrence of x is: 1
// The occurrence of y is: 1
// The occurrence of z is: 1