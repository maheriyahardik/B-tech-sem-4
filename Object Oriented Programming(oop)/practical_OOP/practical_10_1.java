// EXPERIMENT NO : 10 
// Title :- To Understand concept of binary I/O, 
// recursion and generics 
 
// AIM : Write a program to count the total number of chars, 
// words, lines, alphabets, digits, white spaces in givenfile. 
import java.io.*;
import java.util.*;

public class practical_10_1 {

    public static void main(String[] args) throws Exception {

        int char_count = 0;
        int word_count = 0;
        int line_count = 0;
        int wspace_count = 0;
        int digit_count = 0;
        int alphabet_count = 0;

        String fname;
        String temp_str;
        StringTokenizer token;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter filename: ");

        fname = br.readLine();

        br = new BufferedReader(new FileReader(fname));

        while ((temp_str = br.readLine()) != null) {

            line_count++;

            for (int i = 0; i < temp_str.length(); i++) {

                if (Character.isWhitespace(temp_str.charAt(i)))
                    wspace_count++;

                if (Character.isDigit(temp_str.charAt(i)))
                    digit_count++;

                if (Character.isLetter(temp_str.charAt(i)))
                    alphabet_count++;
            }

            token = new StringTokenizer(temp_str, " ");

            while (token.hasMoreTokens()) {
                word_count++;
                String s = token.nextToken();
                char_count += s.length();
            }
        }

        System.out.println("Character Count: " + char_count);
        System.out.println("Word Count: " + word_count);
        System.out.println("Line Count: " + line_count);
        System.out.println("Alphabet Count: " + alphabet_count);
        System.out.println("Digit Count: " + digit_count);
        System.out.println("White Space Count: " + wspace_count);

        br.close();
    }
}
// Enter filename: 
// test.txt
// Character Count: 19
// Word Count: 4
// Line Count: 2
// Alphabet Count: 16
// Digit Count: 3
// White Space Count: 2