// package Arrays;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={2,6,5,8,11};
        int target=140;
        boolean ans=false;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]+arr[j]==target){
        //              ans=true;
        //             break;
        //         }
        //     }
        // }
        HashMap<Integer,Integer>map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int comp=target-arr[i];
            if(map.containsKey(comp)){
                ans=true;
                break;
            }
            map.put(arr[i], i);
        }
        if(ans){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    
}
