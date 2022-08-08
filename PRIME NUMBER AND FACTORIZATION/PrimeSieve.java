import java.util.Arrays;

public class PrimeSieve {
    public static void main(String[] args) {
        int n = 100;
        long prime[] = new long[n+1];
        Arrays.fill(prime, 1);

        findPrime(prime);
        for (int i = 2; i <= n; i++) {
            if (prime[i] == 1) {
                System.out.print(i + " ");
            }
        }
    }

    private static void findPrime(long[] prime) {
        prime[0] = prime[1] = 0;

        for (int i = 2; i < prime.length; i++) {
            if (prime[i] != 0) {
                for (int j = i * i; j < prime.length; j=j+i) {
                    prime[j] = 0;
                }
            }
        }
    }

}
