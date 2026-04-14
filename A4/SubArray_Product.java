import java.util.*;

public class SubArray_Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int k = sc.nextInt();

        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int count = 0;

        for(int i = 0; i < n; i++) {
            int product = 1;

            for(int j = i; j < n; j++) {
                product *= nums[j];

                if(product < k){
                    count++;
                } else {
                    break; 
                }
            }
        }

        System.out.print(count);
    }
}