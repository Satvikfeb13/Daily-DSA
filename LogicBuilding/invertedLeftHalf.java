// package LogicBuilding;

public class invertedLeftHalf {
   public static void main(String[] args) {
    int n = 5;
    for(int i=0;i<n;i++){
        // for spaces
        for(int j=0;j<i+1;j++){
            System.out.print(" ");
        }
        // for stars
        for(int k=0;k<n-i;k++){
            System.out.print("*");
        }
        System.out.println();
    }

   } 
}
