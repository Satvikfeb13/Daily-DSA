// package Arrays;


public class CheckSorted {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        boolean isSorted = true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]>=arr[1]){

            }else{
                isSorted=false;
            }
        }
        if(isSorted){
            System.out.println("sorted");
        }else{
            System.out.println("Unsorted");
        }
    }
    
}
