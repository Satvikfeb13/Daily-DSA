import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum{
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};

        // for(int i=0;i<nums.length;i++){
        //     for(int j=i;j<nums.length;j++){
        //         for(int k=i;k<=j;k++){
        //             if(nums[i]+nums[j]+nums[k]==0){
        //                 System.out.print(nums[i]+" "+nums[j]+" "+nums[k]);
        //             }
        //         }
        //         System.out.println();
        //     }
        // }

        Arrays.sort(nums);
        List<List<Integer>> ans= new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int start=i+1;
            int end=nums.length-1;
            while(start<end){
                int sum=nums[i]+nums[start]+nums[end];
                if(sum==0){
                    ans.add(Arrays.asList(nums[i],nums[start],nums[end]));
                    while(start<end && nums[start]==nums[start+1]) start++;
                    while(start<end && nums[end]==nums[end-1]) end--;
                    start++;
                    end--;
                }else if(sum<0){
                    start++;
                }else{
                    end--;
                }
            }
        }

        for(List<Integer>an:ans){
            System.out.println(an.toString());
        }
    }
}