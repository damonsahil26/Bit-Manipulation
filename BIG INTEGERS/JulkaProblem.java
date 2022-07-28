import java.math.BigInteger;
import java.util.Scanner;

public class JulkaProblem {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        BigInteger total= s.nextBigInteger();
        BigInteger KlaudiaMoreApple= s.nextBigInteger();
        s.close();
        BigInteger NataliaApple = (total.subtract(KlaudiaMoreApple)).divide(BigInteger.valueOf(2));
        BigInteger KlaudiaApple = (total.subtract(NataliaApple));
        System.out.println(KlaudiaApple);
        System.out.println(NataliaApple);
    }
}
