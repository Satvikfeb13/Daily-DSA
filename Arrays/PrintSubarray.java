public class PrintSubarray {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, -2, 7, -4 };
        // to store the answer index
        int startindex = -1;
        int endindex = -1;
        // start index of current sum
        int start = 0;
        long maxi=Long.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(sum==0) start=i;
            sum+=arr[i];
            if(sum>maxi){
                maxi=sum;
                startindex=start;
                endindex=i;
            }
            if(sum<0){
                sum=0;
            }
        }
        for(int i=startindex;i<=endindex;i++){
            System.out.print(arr[i]+" ");
        }

    }

}
