package koushik;

import java.util.function.Consumer;

/**
 * Created by Adwiti on 7/24/2017.
 */
public class UseOfConsumerFunction {
    public static void main(String[] args) {
        Consumer<String> c = p -> System.out.println(p.toUpperCase());
        c.accept("hello world");

        Consumer<String> c1 = p -> System.out.println(p.toLowerCase());
        c1.accept("HELLO WORLD");
    }
}
