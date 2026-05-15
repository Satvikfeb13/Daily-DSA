import java.util.Arrays;

public class SquareSorted {
    public static void main(String[] args) {
        int[] arr = { -4, -1, 0, 3, 10 };
        // brute force
        // time complexiy O(nlogn)
        // int[] ans= new int[arr.length];
        // for(int i=0;i<arr.length;i++){
        // ans[i]=arr[i]*arr[i];
        // }
        // Arrays.sort(ans);
        // System.out.println(Arrays.toString(ans));

        int negindex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negindex++;
            }
        }
        int[] neg = new int[negindex];
        // squaring negative index
        for (int i = 0; i < negindex; i++) {
            neg[i] = arr[i] * arr[i];
        }
        // reverse negative value
        for (int i = 0; i < neg.length / 2; i++) {
            int temp = neg[i];
            neg[i] = neg[neg.length - i - 1];
            neg[neg.length - i - 1] = temp;
        }
        // squaring positive index
        int[] pos = new int[arr.length - negindex];
        for (int i = 0; i < pos.length; i++) {
            int temp = arr[i + negindex] * arr[i + negindex];
            pos[i] = temp;
        }
        int i = 0, j = 0, k = 0;
        int[] ans = new int[arr.length];
        while (i < pos.length && j < neg.length) {
            if (pos[i] < neg[j]) {
                ans[k++] = pos[i++];
            } else {
                ans[k++] = neg[j++];
            }
        }

        while (i < pos.length) {
            ans[k++] = pos[i++];
        }

        while (j < neg.length) {
            ans[k++] = neg[j++];
        }
        System.out.println(Arrays.toString(ans));

    }
}
