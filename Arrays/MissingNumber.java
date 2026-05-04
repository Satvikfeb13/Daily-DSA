// package Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr= {8, 2, 4, 5, 3, 7, 1};
        int size=arr.length-1;
        // Arithmatic approach
        // int arraySum=0;
        // int actualSum=size*(size+1)/2;
        // for(int i:arr){
        //     arraySum+=i;
        // }
        // System.out.println(actualSum-arraySum);
        // XOR Operator

        int xor1=0,xor2=0;

        for(int i=0;i<arr.length;i++)
            
            {

            xor1^=arr[i];

        }

        for(int i=1;i<=arr.length+1;i++)
            {
            xor2^=i;
        }
        System.out.println(xor1^xor2);



    }
    
}
