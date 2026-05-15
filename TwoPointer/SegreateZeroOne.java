import java.util.Arrays;

public class SegreateZeroOne {
    public static void main(String[] args) {
        // int[] arr = { 0, 1, 0, 1, 0, 0, 1, 1, 1, 0 };
        // sorting
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        // O(nlogn)
        // bubble Sort
        // for (int i = 0; i < arr.length; i++) {
        //     boolean isSorted = false;
        //     for (int j = 0; j < arr.length - i - 1; j++) {
        //         if (arr[j] > arr[j + 1]) {
        //             int temp = arr[j];
        //             arr[j] = arr[j + 1];
        //             arr[j + 1] = temp;
        //             isSorted = true;
        //         }
        //     }
        //     if (!isSorted) {
        //         break;
        //     }
        // }
        // System.out.println(Arrays.toString(arr));
        // time complexity O(n^2)
        // two pointer
        // int start=0;
        // int end=arr.length-1;
        // while (start<end) {
        //     if(arr[start]==0){
        //         start++;
        //     }else{
        //         int temp=arr[start];
        //         arr[start]=arr[end];
        //         arr[end]=temp;
        //         end--;
        //     }
        // }   
        // System.out.println(Arrays.toString(arr));


    }
}
