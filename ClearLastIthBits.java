import java.util.Scanner;

public class ClearLastIthBits {
    public static void main(String[] args) {
        int num = 15, i;
        Scanner s = new Scanner(System.in);
        i = s.nextInt();
        s.close();
        int result = ClearLastBitsUptoPositionI(num, i);
        System.out.println(result);
    }

    private static int ClearLastBitsUptoPositionI(int num, int i) {
        int mask = (~0 << i);
        return num & mask;
    }
}
