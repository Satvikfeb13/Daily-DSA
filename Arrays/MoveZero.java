// package Arrays;

import java.util.Arrays;

public class MoveZero {
   public static void main(String[] args) {
    int[] arr={1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
    // int [] ans= new int[arr.length];
    // int index=0;
    // for(int i=0;i<arr.length;i++){
    //     if(arr[i]!=0){
    //         ans[index]=arr[i];
    //         index++;
    //     }
    // }
    // System.out.println(Arrays.toString(ans));

    int j=-1;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==0){
            j=i;
            break;
        }
    }
     if (j == -1) return;

        // Start from the next index of first zero
        for (int i = j + 1; i < arr.length; i++) {
            // If current element is non-zero
            if (arr[i] != 0) {
                // Swap with nums[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                // Move j to next zero
                j++;
            }
        }

   } 
}
