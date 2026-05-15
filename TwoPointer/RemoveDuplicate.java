import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr= {1,1,2};
        // HashSet
        // HashSet<Integer>set= new HashSet<>();
        // for(int i:arr){
        //     set.add(i);
        // }
        // System.out.println(set.size());
        // System.out.println(set.toString());
        // two pointer
        // int j=0;
        // for(int i=1;i<arr.length;i++){
        //     if(arr[i]!=arr[j]){
        //         j++;
        //         arr[j]=arr[i];
        //     }
        // }
        // System.out.println(j+1);
        // int newarray[]=Arrays.copyOf(arr, j+1);
        // System.out.println(Arrays.toString(newarray));
        int officer=0;
        int res=1;
        int cm=1;
        while(cm<arr.length){
            if(arr[cm]==arr[cm-1]){
                cm++;
                continue;
            }
            arr[officer+1]=arr[cm];
            officer++;
            res++;
            cm++;
        }
         System.out.println(res);
    }    
}
