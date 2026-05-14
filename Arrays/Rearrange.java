import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rearrange {
    public static void main(String[] args) {
        int[] arr = { 1, 2, -4, -5 };
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                pos.add(arr[i]);
            } else {
                neg.add(arr[i]);
            }
        }
        for (int i = 0; i < arr.length/2; i++) {
            arr[2*i]=pos.get(i);
            arr[2*i+1]=neg.get(i);
        }
        System.out.println(Arrays.toString(arr));

    }
}
