// 6. How to use Exception handling 
// 1. Write an exception class for a time of day 
// that can accept only 24 hour 
// representation of clock hours. Write a 
// java program to input various formats of 
// timings and throw suitable error 
// messages. 
import java.text.SimpleDateFormat;
import java.util.Date;

public class practical_6_1 {
    public static void main(String[] args) {

        Date dt = new Date();

        SimpleDateFormat dateFormat;
        dateFormat = new SimpleDateFormat("HH:mm:ss");

        System.out.println("Time in 24 hr format = " + dateFormat.format(dt));
    }
}
//Time in 24 hr format = 11:54:11