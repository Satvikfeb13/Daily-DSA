// package Arrays;

import java.util.Arrays;

public class SecSmallSecLarge {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // brute forcce that is sort the array and return last but one element and second element
        Arrays.sort(arr);
        System.out.println(arr[1]);
        System.out.println(arr[arr.length-2]);
        // time complexity O(n)
        // space complexity O(1)
        // int large = Integer.MIN_VALUE;
        // int secLarge = Integer.MIN_VALUE;
        // int small = Integer.MAX_VALUE;
        // int secSmall = Integer.MAX_VALUE;
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] > large) {
        //         secLarge = large;
        //         large = arr[i];
        //     }
        //     if (arr[i] != large && arr[i] > secLarge) {
        //         secLarge = arr[i];
        //     }
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] < small) {
        //         secSmall = small;
        //         small = arr[i];
        //     }
        //     if (arr[i] != small && arr[i] < secSmall) {
        //         secSmall = arr[i];
        //     }
        // }
        // System.out.println(secSmall);
        // System.out.println(secLarge);
    }

}
