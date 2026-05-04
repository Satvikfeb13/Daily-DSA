// package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int [] arr={1,1,2,2,2,3,3};
        // BruteForce approach
        // HashSet<Integer> set = new HashSet<>();
        // for( int i : arr){
        //     set.add(i);
        // }
        // System.out.println(set.toString());
        // Optimal solution 
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[index]){
                index++;
                arr[index]=arr[i];
            }
        }
        // System.out.println(Arrays.toString(arr));
        for(int i=0;i<index+1;i++){
            System.out.println(arr[i]);
        }
        // System.out.println(index+1);
    }
}
