import java.util.Scanner;

public class UpdateIthBit {

    public static void main(String[] args) {
        int num = 5;
        Scanner s = new Scanner(System.in);

        int i = s.nextInt();
        int v = s.nextInt();

        s.close();

        int result = UpdateTheBitAtPosI(num, i, v);
        System.out.println(result);
    }

    private static int UpdateTheBitAtPosI(int num, int i, int v) {
        num = ClearTheBitAtPositionI(num, i);

        //Set The bit
        int mask = (v << i);
        return num | mask;
    }

    private static int ClearTheBitAtPositionI(int num, int i) {
        int mask = ~(1 << i);
        return num & mask;
    }
}
