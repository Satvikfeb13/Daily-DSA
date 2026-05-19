// package LogicBuilding;

public class InvertedFullPyramid {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<n;i++){
            // for space
            for(int k=0;k<i+1;k++){
                System.out.print("  ");
            }
            for(int j=0;j<(2*n)-(2*i)-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }   

    
}