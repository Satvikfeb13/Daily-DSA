public class InvertedV {
    public static void main(String[] args) {

        int n = 7;
        char ch = 'A';

        for (int i = 0; i < n; i++) {

            // Left spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Left character
            System.out.print((char)(ch + n - i - 1));

            // Middle spaces
            if (i != 0) {
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                // Right character
                System.out.print((char)(ch + n - i - 1));
            }

            System.out.println();
        }
    }
}