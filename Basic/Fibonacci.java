public class Fibonacci {
     public static void main(String[] args) {
        int number=6;
        int first=0,second=1,next;
        for(int i=0;i<=number;i++){
            System.out.print(first+" ");
            next=second+first;
            first=second;
            second=next;
        }
     }
    
}
