
public class MaxSubArray_sum {
    public static void main(String[] args) {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSum = nums[0];
        int currSum = 0;

        int start = 0, end = 0;
        int tempStart = 0;

        for(int i = 0; i < nums.length; i++){

            if(currSum == 0){
                tempStart = i;
            }

            currSum += nums[i];

            if(currSum > maxSum){
                maxSum = currSum;
                start = tempStart;
                end = i;
            }

            if(currSum < 0){
                currSum = 0;
            }
        }

        // print subarray
        System.out.print("Max Subarray: ");
        for(int i = start; i <= end; i++){
            System.out.print(nums[i] + " ");
        }

        System.out.println("\nMax Sum: " + maxSum);
    }
}