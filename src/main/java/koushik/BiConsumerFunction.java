package koushik;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

/**
 * Created by Adwiti on 7/25/2017.
 */
public class BiConsumerFunction {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        process(numbers, 2, (v, k) -> System.out.println(v * k));
        process(numbers, 5, (v, k) -> System.out.println(k / v));
    }

    static void process(List<Integer> numbers, int key, BiConsumer<Integer, Integer> consumer) {
        numbers.forEach(v -> {
            consumer.accept(key, v);
        });
    }
}
