package Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Adwiti on 7/25/2017.
 */
public class ListDiscussed {
    public static void main(String[] args) {
        List<Integer> lists = new ArrayList<>();
        lists.add(1);
        lists.add(2);
        lists.add(3);
        lists.add(4);
        lists.add(5);

        printLists(lists, p -> System.out.println(p * 2));
    }

    private static void printLists(List<Integer> lists, Consumer<Integer> printer) {
        lists.forEach(p -> {
            printer.accept(p);
        });
    }
}
