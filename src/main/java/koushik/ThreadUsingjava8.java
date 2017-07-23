package koushik;

/**
 * Created by Adwiti on 7/23/2017.
 */
public class ThreadUsingjava8 {
    public static void main(String[] args) {
        //Using an anonymous class
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World");
            }
        });
        t.start();

        //using java 8

        Thread t1 = new Thread(() -> System.out.println("Hello world of java 8"));
        t1.start();


    }
}
