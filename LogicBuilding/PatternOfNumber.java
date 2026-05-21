public class PatternOfNumber {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            // Space
            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }
            // number
            for (int j = 0; j < i + 1; j++) {
                System.out.print(i + j + 1);
            }
            // number
            for (int l = i - 1; l >= 0; l--) {
                System.out.print(i + l + 1);

            }
            System.out.println();
        }
    }
}
