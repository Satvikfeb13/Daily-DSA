// package DutchNationalFlag;

import java.util.Arrays;

public class SortColor {
    public static void main(String[] args) {

        int[] arr = { 0, 0, 2, 1, 2, 1 };

        // Brute force

        // Sort the array
        // time complexity O(nlogn);
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));

        // better

        // int zeroCount = 0, oneCount = 0, twoCount = 0;
        // for (int i : arr) {
        //     if (i == 0)
        //         zeroCount++;
        //     else if (i == 1)
        //         oneCount++;
        //     else
        //         twoCount++;
        // }
        // int index = 0;
        // System.out.println(zeroCount + " " + oneCount + " " + twoCount);
        // while (zeroCount!=0) {
        //     arr[index++] = 0;
        //     zeroCount--;
        // }
        // while (oneCount!=0) {
        //     arr[index++] = 1;
        //     oneCount--;
        // }
        // while (twoCount!=0) {
        //     arr[index++] = 2;
        //     twoCount--;
        // }
        // System.out.println(Arrays.toString(arr));

        // Optimal Solution 

        // Time complexity O(n)

        // int start =0;
        // int end=arr.length-1;
        // int index=0;
        // while(index<=end){
        //     if(arr[index]==0){
        //         int temp=arr[index];
        //         arr[index]=arr[start];
        //         arr[start]=temp;
        //         start++;
        //         index++;
        //     }else if( arr[index]==1){
        //         index++;
        //     }else{
        //         int temp= arr[index];
        //         arr[index]=arr[end];
        //         arr[end]=temp;
        //         end--;
        //     }
        // }
        // System.out.println(Arrays.toString(arr));


    }
}
