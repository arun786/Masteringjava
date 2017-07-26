package DataAPIInJava8;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Created by Adwiti on 7/26/2017.
 */
public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        date = LocalDate.of(2017,3,30);
        System.out.println(date);


        LocalTime time = LocalTime.now();
        System.out.println(time);
    }
}
