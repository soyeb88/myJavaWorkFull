package BasicJava;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeDemo {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println("Time: " + time);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String formattedTime = time.format(formatter);
        System.out.println("Formatted Time: " + formattedTime);
    }
}
