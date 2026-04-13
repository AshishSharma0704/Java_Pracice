public class mergesortedarray {
    public static void main(String[] args) {
        
    
    int[] nums1 ={1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        int j =0;
        int k = m+n;
        int i =0; 
        while(i<k && j<n){
            if(nums1[i] == 0){
                int temp = nums2[j];
                nums2[j] = nums1[i];
                nums1[i] = temp;
                i++;
                j++;
            }else if(nums1[i]<=nums2[j]){
                i++;
            }else {
                int temp = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = temp;
                i++;
                
            }
           
                
           

        } for(int val : nums1){
            System.out.print(val + " ");
        
        
    }
}}