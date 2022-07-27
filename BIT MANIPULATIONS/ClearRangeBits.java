import java.util.Scanner;

public class ClearRangeBits {
    public static void main(String[] args) {
        int num = 15, i, j;
        Scanner s = new Scanner(System.in);
        i = s.nextInt();
        j = s.nextInt();
        s.close();
        int result = ClearBitsInRange(num, i, j);
        System.out.println(result);
    }

    private static int ClearBitsInRange(int num, int i, int j) {
        //A is for mask for the range from start to j+1
        int a = (~0) << j+1;
        //B is for mask for the range from end to i
        int b= (1<<i)-1;
        //Total Required mask
        int mask= a|b;
        //Final Cleared Bits
        return num & mask;
    }
}