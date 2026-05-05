public class KadaneAlgo {
    public static void main(String[] args) {
        int[] arr={2, 3, 5, -2, 7, -4};
        //  Maximum Sum
        // int bestending=arr[0];
        // int result=arr[0]; 
        // for(int i=1;i<arr.length;i++){
        //     int v1=arr[i];
        //     int v2 =bestending+arr[i];
        //     bestending=Math.max(v1,v2);
        //     result=Math.max(result, bestending);
        // }
        // System.out.println(result);
        // minimum Sum
        // int result=arr[0];
        // int bestending=arr[0];
        // for(int i=1;i<arr.length;i++){
        //     int v1=arr[i];
        //     int v2=bestending+arr[i];
        //     bestending=Math.min(v1, v2);
        //     result=Math.min(result, bestending);
        // }
        // System.out.println(result);
        // Product Sum
        int result=arr[0];
        int minEnding=arr[0];
        int maxEnding=arr[0];
        for(int i=0;i<arr.length;i++){
            int v1=arr[i];
            int v2=minEnding*arr[i];
            int v3=maxEnding*arr[i];
            minEnding=Math.min(v1, Math.max(v2, v3));
            maxEnding=Math.max(v1, Math.max(v2, v3));
            result=Math.max(result, Math.max(maxEnding, minEnding));
        }
        System.out.println(result);
    }    
}
