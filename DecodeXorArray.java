public class DecodeXorArray {
    public static void main(String[] args) {
        int encoded[] = new int[] {6,2,7,3 };
        int first = 4;
        int decoded[] = new int[encoded.length + 1];
        decoded[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            decoded[i + 1] = encoded[i] ^ decoded[i];
        }

        System.out.print("[");
        for (int i = 0; i < decoded.length; i++) {
            System.out.print(" " + decoded[i] + " ");
        }
        System.out.print("]");
    }
}
