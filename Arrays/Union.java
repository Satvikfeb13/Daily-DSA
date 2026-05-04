// package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Union {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 2, 3, 4, 4, 5 };
        int len1 = arr1.length;
        int len2 = arr2.length;
        // as i heard the word unique the data struture use that will be the HashSet
        // HashSet<Integer> set= new HashSet<>();
        // for(int i=0;i<len1;i++){
        // set.add(arr1[i]);
        // }
        // for(int i=0;i<len2;i++){
        // set.add(arr2[i]);
        // }
        // System.out.println(set.toString());
        // List<Integer> ans = new ArrayList<>();

        // int i = 0;
        // int j = 0;
        // while (i < len1 && j < len2) {
        //     int val;
        //     if (arr1[i] == arr2[j]  ) {
        //         val= arr1[i];
        //         i++;
        //         j++;
        //     } else if (arr1[i] < arr2[j]) {
        //            val= arr1[i];
        //         i++;
        //     } else {
        //            val= arr2[j];
        //         j++;
        //     }
        //    if (!ans.contains(val)) ans.add(val); 
        // }
        // while (i < len1) {
        //    if(!ans.contains(arr1[i])) ans.add(arr1[i]);
        //     i++;
        // }
        // while (j < len2) {
        //     if(!ans.contains(arr2[j])) ans.add(arr2[j]);
        //     j++;
        // }
        // System.out.println(ans);

    }

}
