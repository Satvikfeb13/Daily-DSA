public class Diamond {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            // space
            for(int k=0;k<n-i;k++){
                System.out.print(" ");
            }

            // Stars
            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=0;i--){
            // space
            for(int k=0;k<n-i;k++){
                System.out.print(" ");
            }

            // Stars
            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
