// package Arrays;

import java.util.Arrays;

public class Sort123 {

    public static void swap(int arr [],int  num1,int num2){
        int temp=arr[num1];
        arr[num1]=arr[num2];
        arr[num2]=temp;
    }
    public static void main(String[] args) {

        int[] arr = { 1, 0, 2, 1, 0 };
         int start=0;
         int end=arr.length-1;
         int index=0;
        while(index<=end){
            if(arr[index]==0){
                swap(arr,start,index);
                index++;
                start++;
            }else if(arr[index]==1){
                index++;
            }else{
                swap(arr,index,end);
                end--;
            }
        }
        System.out.println(Arrays.toString(arr));
        



        // int zeroCount = 0, OneCount = 0, TwoCount = 0;
        // for (int i : arr) {
        //     if (arr[i] == 0)
        //         zeroCount++;
        //     else if (arr[i] == 1)
        //         OneCount++;
        //     else
        //         TwoCount++;
        // }
        // int index = 0;
        // while (zeroCount!=0) {
        //     arr[index] = 0;
        //     index++;
        //     zeroCount--;
        // }
        // while (OneCount!=0) {
        //     arr[index] = 1;
        //     index++;
        //     OneCount--;
        // }
        // while (TwoCount!=0) {
        //     arr[index] = 2;
        //     index++;
        //     TwoCount--;
        // }


    }

}
