public class ReverseCharBridge {
    public static void main(String[] args) {
        int n = 8;
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            // left side
            for (int j = 0; j < n - i; j++) {
                System.out.print((char)(ch + j));
            }
            // spaces (only if i > 0)
            int spaces = (i == 0) ? 0 : (2 * i - 1);
            for (int k = 0; k < spaces; k++) {
                System.out.print(" ");
            }
            // right side
            for (int j = n - i - 1; j >= 0; j--) {
                System.out.print((char)(ch + j));
            }
            System.out.println();
        }
    }
}
