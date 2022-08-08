import java.math.BigInteger;

public class StrangeFunction {
    public static void main(String[] args) {

        long a = 66466095697L;
        long n = 18456394581L;

        long result = calculatePower(a, n);

        if(result == 0)
        System.out.println(9);

        else{
            System.out.println(result);
        }
    }

    // private static long strangeFunction(long result) {
    //     long sum = 0;
    //     while (result > 0) {
    //         sum = sum + (result % 10);
    //         result = result / 10;
    //     }
    //     if(sum > 9){
    //         return strangeFunction(sum);
    //     }

    //     return sum;
    // }

    private static long calculatePower(long a, long n) {
        long result = 1;
        while (n > 0) {
            if ((n & 1L) == 1) {
                result = result * a;
                result = result % 9;
            }
            a *= a;
            a %= 9L;
            n = n >> 1L;
        }
        return result;
    }

}
