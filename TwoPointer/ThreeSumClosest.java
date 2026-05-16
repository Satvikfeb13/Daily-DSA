import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] arr={-1,2,1,-4};
        int target=1;
        int res=0;
        int maxiDiff=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++){
            int start=i+1;
            int end=arr.length-1;
            while(start<end){
                int sum=arr[i]+arr[start]+arr[end];
                int diff= Math.abs(sum-target);
                if(diff<maxiDiff){
                    maxiDiff=diff;
                    res=sum;
                }
                if(sum==target){
                    System.out.println(sum);
                    return;
                }else if(sum<target){
                    start++;
                }else{
                    end--;
                }
              
            }
        }
        System.out.println(res);

    }   
}
