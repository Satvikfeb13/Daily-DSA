public class NumberWithDiamond {
    public static void main(String[] args) {

        int n = 3;

        // Upper part
        for (int i = 1; i <= n; i++) {

            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Descending numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Ascending numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

        // Lower part
        for (int i = n - 1; i >= 1; i--) {

            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Descending numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Ascending numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}