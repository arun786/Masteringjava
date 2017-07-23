package koushik;

interface Arithmetics {
    int action(int a, int b);
}

/**
 * Created by Adwiti on 7/23/2017.
 */
public class ArithmeticFunction_1 {
    public static void main(String[] args) {
        Arithmetics sum = (k, v) -> k + v;
        Arithmetics mul = (k, v) -> k * v;
        System.out.println(sum.action(10,20));
        System.out.println(mul.action(10,20));
    }
}
