package com.arun.LambdaExpressions;

/**
 * Created by Adwiti on 7/11/2017.
 */
public class ThreadRunnable {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World");
            }
        }).start();

        /*using java 8*/
        new Thread(() -> System.out.println("Hello World using Java 8..")).start();
    }


}
