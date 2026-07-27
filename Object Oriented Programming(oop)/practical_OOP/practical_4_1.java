// Experiment : 4 
// Title :- String class, StringBuilder Class and 
// StringBuffer class. 
 
// AIM : Write a Java Program to Count Number of Words in 
// Given String
public class practical_4_1 {
    public static void main(String[] args) {

        String str = "i love India";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if ((i == 0 && str.charAt(i) != ' ') || 
                (str.charAt(i) != ' ' && str.charAt(i - 1) == ' ')) {
                count++;
            }
        }

        System.out.println("Number of words in string: " + count);
    }
}
// Number of words in string: 3