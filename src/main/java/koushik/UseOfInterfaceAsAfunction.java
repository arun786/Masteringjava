package koushik;

interface Arithmetic {
    public int sum(int num1, int num2);
}

/**
 * Created by Adwiti on 7/22/2017.
 */
public class UseOfInterfaceAsAfunction {

    public static void main(String[] args) {

        Arithmetic ath = (x, y) -> {
            int sum = x + y;
            return sum;
        };

        System.out.println(ath.sum(10, 20));
    }
}
