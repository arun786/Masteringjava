package koushik;

interface StringLength {
    int lengthOfString(String word);
}

/**
 * Created by Adwiti on 7/22/2017.
 */
public class LengthOfString {
    public static void main(String[] args) {
        StringLength sl = x -> x.length();
        System.out.println(sl.lengthOfString("arun"));
    }
}
