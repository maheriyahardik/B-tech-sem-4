import java.util.*;

public class abhayp1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String v ;
        v=sc.nextLine();
        
        int count = 0;

        for (int i = 0; i < v.length(); i++) {
            if ((i == 0 && v.charAt(i) != ' ') || (v.charAt(i) != ' ' && v.charAt(i - 1) == ' '))
            {
                count++;
            }
        }

        System.out.println("Number of words in string: " + count);
        sc.close();
    }

} 