import java.util.Scanner;

class GetIthBit{
    public static void main(String[] args) {
        int num=5;
        Scanner s =new Scanner(System.in);

        int i= s.nextInt();
        int result= GetTheBitAtPosI(num,i);
        System.out.println(result);
    }

    private static int GetTheBitAtPosI(int num, int i){
        int mask =  (1<<i);
        return (num & mask) > 0 ? 1 : 0;
    }
}