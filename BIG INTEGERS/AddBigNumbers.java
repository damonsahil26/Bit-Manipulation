public class AddBigNumbers {
    public static void main(String[] args) {
        System.out.println(addStrings("11119", "99999"));
    }

    public static String addStrings(String num1, String num2) {
        String sum = "";
        if (num1.length() > num2.length()) {
            String temp = num1;
            num1 = num2;
            num2 = temp;
        }

        num1 = reverseString(num1);
        num2 = reverseString(num2);
        int carry = 0;
        int total = 0;
        int bit1 = 0;
        int bit2 = 0;
        for (int i = 0; i < num2.length(); i++) {
            if (i < num1.length()) {
                bit1 = Character.getNumericValue(num1.charAt(i));
                bit2 = Character.getNumericValue(num2.charAt(i));
                total = (bit1 + bit2 + carry) % 10;
                sum += total;
                carry = (bit1 + bit2 + carry) / 10;
            } else {
                bit2 = Character.getNumericValue(num2.charAt(i));
                total = (bit2 + carry) % 10;
                sum += total;
                carry= (bit2 + carry) / 10;
            }
        }
        if(carry !=0){
            sum+=carry;
        }

        return reverseString(sum);
    }

    private static String reverseString(String str) {
        String nstr = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); // extracts each character
            nstr = ch + nstr; // adds each character in front of the existing string
        }
        return nstr;
    }

}
