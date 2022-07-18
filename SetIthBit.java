import java.util.Scanner;

public class SetIthBit {
    public static void main(String[] args) {
        int num = 5, i;
        Scanner s= new Scanner(System.in);
        i=s.nextInt();
        s.close();
        int result = SetBitAtPositionI(num,i);
        System.out.println(result);
    }

    private static int SetBitAtPositionI(int num, int i){
        int mask = (1<<i);
        return num | mask;
    }

}
