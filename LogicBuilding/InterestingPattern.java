import java.util.Scanner;

public class InterestingPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = scanner.nextInt();
        // upper part
        for (int i = 0; i < n; i++) {
            // part one star
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            // part two space
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("  ");
            }
            // part three star
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // Lower part
        for (int i = 0; i < n; i++) {
            // part one star
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            // part two space
            for (int j = 0; j < 2 * n - 2 * i - 1; j++) {
                System.out.print("  ");
            }
            // part three star
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
