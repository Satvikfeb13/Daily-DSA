// package Arrays;

import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        int arr[]={2,5,1,3,0};
        // brute force
        // sort the array ans display the last element 
        // talking about the time complexity that will be  O(nlogn)
        // Arrays.sort(arr);
        // System.out.println(arr[arr.length-1]);
        // Optimal way that is 
        int maxValue=Integer.MIN_VALUE;
        for(int i: arr){
            if(i>maxValue){
                maxValue=i;
            }
        }
        System.out.println(maxValue);

    }
}
