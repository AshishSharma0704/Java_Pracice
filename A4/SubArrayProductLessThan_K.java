
public class SubArrayProductLessThan_K {
    public static void main(String[] args) {

        // Hardcoded array and k
        int[] arr = {1, 2, 3};
        int k = 10;

        int left = 0;
        int product = 1;
        int count = 0;

        for (int right = 0; right < arr.length; right++) {
            product *= arr[right];

            while (product >= k) {
                product /= arr[left];
                left++;
            }

            count += (right - left + 1);
        }

        System.out.println("Number of subarrays: " + count);
    }
}
