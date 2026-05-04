// package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        boolean ans = false;
        int target = 7;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans = true;
            }
        }
        if (ans) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }

    }

}
