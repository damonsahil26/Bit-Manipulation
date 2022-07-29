public class LongBinaryMultiplication {
    public static void main(String[] args) {
        int a = 2000, b = 200, c = 1337;
        int result = binaryMultiplication(a, b, c);
        System.out.println(result);
    }

    private static int binaryMultiplication(int a, int b, int c) {
        int result = 0;
        while (b != 0) {
            if ((b & 1) == 1) {
                result = result + a;
                result %= c;
            }

            a += a;
            a %= c;
            b = b >> 1;
        }
        return result;
    }

}
