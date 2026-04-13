import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={3,4,2,1,6,5};
        int n=arr.length;

        for(int i=0; i<n-1; i++){
            int current=i;
            for(int j=i+1; j<n;j++){
                if(arr[j]<arr[current]){
                   current=j;
                }
            }
            
            int temp =arr[i];
            arr[i]=arr[current];
            arr[current]=temp;

            
        }System.out.println(Arrays.toString(arr));
    }
}
