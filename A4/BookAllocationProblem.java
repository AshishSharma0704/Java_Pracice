import java.util.*;

public class BookAllocationProblem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();

            int arr[] = new int[n];
            int max = 0, sum = 0;

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                max = Math.max(max, arr[i]);
                sum += arr[i];
            }

            
            if(m > n){
                System.out.println(-1);
                continue;
            }

            int low = max;
            int high = sum;
            int ans = sum;

            while(low <= high){
                int mid = (low + high) / 2;

                int students = 1;
                int pages = 0;

                for(int i = 0; i < n; i++){
                    if(pages + arr[i] <= mid){
                        pages += arr[i];
                    } else {
                        students++;
                        pages = arr[i];
                    }
                }

                if(students <= m){
                    ans = mid;
                    high = mid - 1;  
                } else {
                    low = mid + 1;   
                }
            }

            System.out.println(ans);
        }
    }
}