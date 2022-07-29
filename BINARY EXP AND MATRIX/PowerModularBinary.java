public class PowerModularBinary {
    public static void main(String[] args) {
        long a = 2, b = 10;
        long power = calcPower(a, b);
        System.out.println(power);
    }

    private static long calcPower(long a, long b) {
        long mod=1000000007;
        long result = 1;
        while (b != 0) {
            if ((b & 1) == 1) {
                result = result * a;
                result=result % mod;
            }
            a *= a;
            a=a % mod;
            b = b >> 1;
        }
        return result;
    }
}
