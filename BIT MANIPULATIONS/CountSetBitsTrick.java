import java.util.Scanner;

public class CountSetBitsTrick {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int num = s.nextInt();
            s.close();
            int result = RemoveTheSetBitsAndCount(num);
            System.out.println(result);
        }
    
        private static int RemoveTheSetBitsAndCount(int num) {
            int count = 0;
            while (num > 0) {
                num=num & num-1;
                count++;
            }
            return count;
        }
    }
