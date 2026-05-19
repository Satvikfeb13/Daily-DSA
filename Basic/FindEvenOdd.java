class FindEvenOdd{
    public static void main(String[] args) {
        int n=2;
        if(n%2==0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }

        // & bitwise Operator
        if((n&1)==0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }

    }
}