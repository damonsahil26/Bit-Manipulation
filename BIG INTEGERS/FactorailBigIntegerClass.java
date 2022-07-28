import java.math.BigInteger;

public class FactorailBigIntegerClass {
    public static void main(String[] args) {
        int num=100;
        BigInteger fact = factorial(num);
        System.out.println(fact);
    }

    private static BigInteger factorial(int num) {
        if(num == 0 || num == 1){
            return BigInteger.ONE;
        }

        return BigInteger.valueOf(num).multiply(factorial(num-1));
    }
}
