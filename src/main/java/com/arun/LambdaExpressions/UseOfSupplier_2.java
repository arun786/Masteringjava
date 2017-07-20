package com.arun.LambdaExpressions;

import java.util.Objects;
import java.util.function.Supplier;

/**
 * Created by Adwiti on 7/19/2017.
 */
public class UseOfSupplier_2 {

    public static BruceLee produce(Supplier<BruceLee> supplier) {
        return supplier.get();
    }

    public static void main(String[] args) {
        BruceLee bruceLee = new BruceLee();

        BruceLee b1 = produce(() -> bruceLee);
        BruceLee b2 = produce(() -> bruceLee);
        System.out.println(Objects.equals(b1, b2));
    }

}

class BruceLee {
    public BruceLee() {
        System.out.println("Bruce lee was a great martial artists");
    }
}