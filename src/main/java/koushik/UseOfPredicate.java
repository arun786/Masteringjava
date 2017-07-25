package koushik;

import java.util.function.Predicate;

/**
 * Created by Adwiti on 7/24/2017.
 */
public class UseOfPredicate {

    public static void main(String[] args) {
        Predicate<Integer> number = p -> p > 10;
        System.out.println(number.test(20));
        System.out.println(number.test(2));
    }
}
