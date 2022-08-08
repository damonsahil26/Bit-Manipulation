public class MatrixExponentiation {
    public static void main(String[] args) {
        long n = 90;
        long result = FindNThTerm(n);

        System.out.println(result);

    }

    private static long FindNThTerm(long n) {

        if (n == 0) {
            return 0;
        }

        long identity[][] = new long[2][2];
        identity[0][0] = 1;
        identity[0][1] = 1;
        identity[1][0] = 1;
        identity[1][1] = 0;

        calculatePower(identity, n - 1);

        return identity[0][0];
    }

    private static void calculatePower(long[][] identity, long n) {

        if (n == 0 || n == 1) {
            return;
        }

        long multiplier[][] = new long[2][2];
        multiplier[0][0] = 1;
        multiplier[0][1] = 1;
        multiplier[1][0] = 1;
        multiplier[1][1] = 0;

        calculatePower(identity, n / 2);
        multiply(identity, identity);

        if ((n & 1) == 1) {
            multiply(identity, multiplier);
        }
    }

    public static void multiply(long F[][], long M[][]) {
        long x = F[0][0] * M[0][0] + F[0][1] * M[1][0];
        long y = F[0][0] * M[0][1] + F[0][1] * M[1][1];
        long z = F[1][0] * M[0][0] + F[1][1] * M[1][0];
        long w = F[1][0] * M[0][1] + F[1][1] * M[1][1];

        F[0][0] = x;
        F[0][1] = y;
        F[1][0] = z;
        F[1][1] = w;
    }
}
