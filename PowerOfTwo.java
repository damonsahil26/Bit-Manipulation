import java.util.Scanner;

//If N & N-1 == 0 then N is [power] of 2.
public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();

        if ((n & (n - 1)) == 0) {
            System.out.println("Yes " + n + " is power of 2");
        } else {
            System.out.println("No " + n + " is not a power of 2");
        }
    }
}
