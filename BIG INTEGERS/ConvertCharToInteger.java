public class ConvertCharToInteger {
    public static void main(String[] args) {
        char ch = '1';
        int num = ConvertCharToInt(ch);
        System.out.println(num);
    }

    private static int ConvertCharToInt(char ch) {
        return ch - '0';
    }
}
