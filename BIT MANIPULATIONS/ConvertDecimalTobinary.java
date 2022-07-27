import java.util.Scanner;

public class ConvertDecimalTobinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.close();
        int result = ToBinary(num);
        System.out.println(result);
    }

    private static int ToBinary(int num) {
        int count = 0;
        int i = 0;
        while (num > 0) {
            int power = (int) Math.pow(10, i);
            i++;
            int lastBit = num & 1;
            count += lastBit * power;
            num = num >> 1;
        }

        return count;
    }
}
