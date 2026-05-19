// package LogicBuilding;

public class leftHalf {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            // spaces
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            // stars
            for (int k = 0; k < i+1; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
