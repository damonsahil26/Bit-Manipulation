import java.util.Scanner;

//Replace Bits From N containing M bits.
public class ReplaceBits {
    public static void main(String[] args) {
        int N = 2048, M = 21, i, j;
        Scanner s = new Scanner(System.in);
        i = s.nextInt();
        j = s.nextInt();
        s.close();

        int result = ReplaceTheBits(N, M, i, j);
        System.out.println(result);
    }

    private static int ReplaceTheBits(int N, int M, int i, int j) {
        int a = ClearBitsInRange(N, i, j);
        int b = M << i;

        return a | b;
    }

    private static int ClearBitsInRange(int N, int i, int j) {
        int a = (~0) << j + 1;
        int b = (1 << i) - 1;
        int mask = a | b;

        return N & mask;
    }
}
