public class StairCasePattern {
    public static void main(String[] args) {
        int n=6;
        for(int i=1;i<=n;i++){
            int k;
            if(i%2!=0){
                k=i+1;
            }else{
                k=i;
            }
            for(int j=0;j<k;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
