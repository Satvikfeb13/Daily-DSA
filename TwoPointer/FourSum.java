import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

    public static void main(String[] args) {

        int[] arr = { 1, 0, -1, 0, -2, 2 };
        int target = 0;

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 3; i++) {

            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < arr.length - 2; j++) {

                if (j > i + 1 && arr[j] == arr[j - 1]) {
                    continue;
                }

                int start = j + 1;
                int end = arr.length - 1;

                while (start < end) {

                    int sum = arr[i] + arr[j] + arr[start] + arr[end];

                    if (sum == target) {

                        result.add(Arrays.asList(
                                arr[i],
                                arr[j],
                                arr[start],
                                arr[end]));

                        start++;
                        end--;

                        while (start < end && arr[start] == arr[start - 1]) {
                            start++;
                        }

                        while (start < end && arr[end] == arr[end + 1]) {
                            end--;
                        }

                    } else if (sum < target) {
                        start++;
                    } else {
                        end--;
                    }
                }
            }
        }

        for (List<Integer> a : result) {
            System.out.println(a);
        }
    }
}