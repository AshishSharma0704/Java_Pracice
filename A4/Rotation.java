import java.util.*;

public class Rotation {

    public static void reverse(int[] arr, int l, int r){
        while(l < r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int operation = sc.nextInt();
        int[] newArr = new int[n];
        for(int i = 0; i < operation; i++){

            int k = sc.nextInt();
            k = k % n;

            reverse(arr, 0, n-1);
            reverse(arr, 0, k-1);
            reverse(arr, k, n-1);
             for(int j = 0; j < n; j++){
                newArr[j] += arr[j];
            }
            arr=newArr.clone();

        }
        for(int i = 0; i < n; i++){
            System.out.print(newArr[i]+" ");
        }
        int sum=0;
        for(int i = 0; i < n; i++){
            sum+=arr[i];
        }
        System.out.println(sum%1000000007);

        sc.close();
    }
}