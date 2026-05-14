public class StockBuyandSell {
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        // firstly find out the minimum stock that i will buy
        int minimum=Integer.MAX_VALUE;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<minimum){
                minimum=arr[i];
            }else{
                ans=Math.max(ans, arr[i]-minimum);
            }
        }
        System.out.println(ans);
    }    
}
