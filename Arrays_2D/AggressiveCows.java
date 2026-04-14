package Arrays_2D;

import java.util.*;

public class AggressiveCows {

    public static boolean canPlace(int[] stalls, int k, int dist){
        int count = 1; // first cow
        int lastPos = stalls[0];

        for(int i = 1; i < stalls.length; i++){
            if(stalls[i] - lastPos >= dist){
                count++;
                lastPos = stalls[i];
            }
        }

        return count >= k;
    }

    public static void main(String[] args) {

        int[] stalls = {1, 2, 4, 8, 9};
        int k = 3;

        Arrays.sort(stalls);

        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0];

        int ans = 0;

        while(low <= high){
            int mid = (low + high) / 2;

            if(canPlace(stalls, k, mid)){
                ans = mid;
                low = mid + 1; // try bigger distance
            } else {
                high = mid - 1;
            }
        }

        System.out.println(ans);
    }
}
