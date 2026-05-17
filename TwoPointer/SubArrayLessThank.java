public class SubArrayLessThank {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 2, 6 };
        int sum = 100;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int product = 1;
            for (int j = i; j < arr.length; j++) {
                product *= arr[j];
                if (product < sum) {
                    count++;
                } else {
                    break;
                }

            }
        }
        System.out.println("Count of subarrays with product less than " + sum + " is: " + count);
    }
}
