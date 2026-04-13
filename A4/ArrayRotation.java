import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        int k = 8;
        k = k % n;   

        for(int j = 0; j < k; j++) {

            int key = arr[n - 1];  

            for(int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }

            arr[0] = key;
        }

        System.out.println(Arrays.toString(arr));
    }
}
