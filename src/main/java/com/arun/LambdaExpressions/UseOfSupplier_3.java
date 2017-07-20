package com.arun.LambdaExpressions;

import java.util.Date;
import java.util.function.Supplier;

/**
 * Created by Adwiti on 7/20/2017.
 */
public class UseOfSupplier_3 {
    public static void main(String[] args) {
        Supplier<String> strSupplier = () -> new String("Hello World");
        System.out.println(strSupplier.get());

        Supplier<String> emptyString = String::new;
        System.out.println(emptyString.get());

        Supplier<Date> strDate = Date::new;
        System.out.println(strDate.get());
    }
}
