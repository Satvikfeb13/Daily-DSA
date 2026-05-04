// package Arrays;

public class CountMax {
    public static void main(String[] args) {
        int[] arr={1,1,0,1,1,1,1};
        int maxOne=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                maxOne=Math.max(maxOne, count);
            }else{
                count=0;
            }
        }
        System.out.println(maxOne);
    }
    
}
