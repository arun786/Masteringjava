package koushik;

interface Sum {
    int sum(int x, int y, int z);
}

interface Sub {
    int sub(int x, int y);
}

interface Mul {
    int mul(int x, int y);
}

interface Div {
    float div(float x, float y);
}

/**
 * Created by Adwiti on 7/22/2017.
 */
public class ArithmeticFnction {
    public static void main(String[] args) {
        Sum sum = (x, y, z) -> x + y + z;

        Mul mul = (x, y) -> x * y;

        Sub sub = (x, y) -> x - y;

        Div div = (x, y) -> {
            if (y == 0) {
                return 0;
            }
            return x / y;
        };

        System.out.println(sum.sum(10, 20, 30));
        System.out.println(mul.mul(10, 20));
        System.out.println(sub.sub(20, 10));
        System.out.println(div.div(20, 5));
    }
}
