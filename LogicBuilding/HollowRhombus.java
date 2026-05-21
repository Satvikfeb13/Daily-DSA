public class HollowRhombus {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {
            // for space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // for stars
            if (i == 0 || i == n - 1) {
                for (int k = 0; k < n; k++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int l = 0; l < n - 2; l++) {
                    System.out.print(" ");
                }
                System.out.print("*");

            }

            System.out.println();
        }
    }
}
