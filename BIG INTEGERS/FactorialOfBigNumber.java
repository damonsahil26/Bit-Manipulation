import java.util.*;

public class FactorialOfBigNumber {
    public static void main(String[] args) {

        int num = 100;
        List<Integer> result = new ArrayList<Integer>();

        result.add(1);
        int size=result.size();
        for (int i = 2; i <= num; i++) {
           size = multiply(i, result,size);
        }

        Collections.reverse(result);
        for (Integer integer : result) {
            System.out.print(integer);
        }
    }

    private static int multiply(int num, List<Integer> result,int size) {
        int carry = 0;
        for (int i = 0; i < size; i++) {
            int product = ((num * result.get(i)) + carry);
            result.set(i, product % 10);
            carry = product / 10;
        }

        while (carry != 0) {
            result.add(carry % 10);
            carry = carry / 10;
        }
        return result.size(); 
    }
}
