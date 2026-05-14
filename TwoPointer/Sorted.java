import java.util.Arrays;

public class Sorted {

    public static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { i + 1, j + 1 };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static int[] twosum2(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int sum= arr[start]+arr[end];
            if(sum==target){
                return new int[]{start+1,end+1};
            }else if(sum>target){
                end--;
            }else{
                start++;
            }
        }
        return  new int[] {-1,-1};
    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
        System.out.println(Arrays.toString(twosum2(arr, target)));

    }
}