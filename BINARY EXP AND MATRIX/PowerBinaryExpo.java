public class PowerBinaryExpo {
    public static void main(String[] args) {
        long a = 2, b = 62;
        long power = calcPower(a, b);
        System.out.println(power);
    }

    private static long calcPower(long a, long b) {
        long result = 1;
        while (b != 0) {
            if ((b & 1) == 1) {
                result = result * a;
            }
            a *= a;
            b = b >> 1;
        }
        return result;
    }
}
