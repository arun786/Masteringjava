package koushik;

interface Multiple {
    float multiply(float x, float y);
}

/**
 * Created by Adwiti on 7/22/2017.
 */
public class UseOfInterfaceAsAfunction_1 {
    public static void main(String[] args) {
        Multiple m = (k, v) -> {
            return k * v;
        };

        System.out.println(m.multiply(12.6f, 13.6f));
    }

}

