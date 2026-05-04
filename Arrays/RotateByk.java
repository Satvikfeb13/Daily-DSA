// package Arrays;

import java.util.Arrays;

public class RotateByk {


    public static void swap(int[] arr, int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

    }
   public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7};
    int k=2;
    String str="left";
    k=k%arr.length;
    
    if(str.startsWith("right")){
        swap(arr, 0, arr.length-1);
        swap(arr, 0, k-1);
        swap(arr, k, arr.length-1);
    }else{
        swap(arr, 0, k-1);
        swap(arr, k, arr.length-1);
        swap(arr, 0, arr.length-1);
    }
    System.out.println(Arrays.toString(arr));
   } 
}
