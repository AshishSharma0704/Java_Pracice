public class MergeArrays {
    public static void main(String[] args) {
        int nums1[]={1,3};
        int nums2[] = {2};

        int n=nums1.length;
        int m=nums2.length;

        int length=n+m;

        int Arr []=new int[length];
        int i=0;int j=0;int k=0;
        while(i<n && j<m){
            if(nums1[i] <nums2[j]){
                Arr[k]=nums1[i];
                i++;
            }else{
                Arr[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<n){
            Arr[k++]=nums1[i];
            i++;
        }
        while(j<m){
            Arr[k++]=nums2[j];
            j++;
        }
        for(int nums :Arr){
        System.out.print(nums);
    }
    }
    
}
