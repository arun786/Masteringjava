package koushik;

interface greet {
    void perform();
}

interface Java8Greet {
    void perform();
}

/**
 * Created by Adwiti on 7/22/2017.
 */
public class WhatIsfunction {


    //Before Java 8
    public static void greet() {
        System.out.println("Hello wOrld");
    }

    public static void greet(greet greet) {
        greet.perform();
    }

    public static void main(String[] args) {
        greet();
       /*we could have made it more generic by using interface*/
        greet c1 = new CGreet();
        greet(c1);

        greet c2 = new DGreet();
        greet(c2);

        //or java 8

        Java8Greet j8g = () -> System.out.println("Hello Java 8");
        j8g.perform();

        j8g = () -> System.out.println("Hello Java 8 Universe");
        j8g.perform();

    }


}

class CGreet implements greet {
    @Override
    public void perform() {
        System.out.println("Hello World");
    }
}

class DGreet implements greet {

    @Override
    public void perform() {
        System.out.println("Hello Universe");
    }
}