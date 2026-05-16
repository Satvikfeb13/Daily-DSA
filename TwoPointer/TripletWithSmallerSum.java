import java.util.Arrays;

public class TripletWithSmallerSum {
    public static void main(String[] args) {
        int[] arr = { -2, 0, 1, 3 };
        int sum = 2;
        int res = 0;
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            int start = i + 1;
            int end = arr.length - 1;
            while (start < end) {
                int tripletSum = arr[i] + arr[start] + arr[end];
                if (tripletSum < sum) {
                    count += (end - start);
                    start++;
                } else {
                    end--;
                }
            }
        }
        System.out.println(count);

    }
}
