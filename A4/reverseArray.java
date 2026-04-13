import java.util.*;
public class reverseArray {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int n= sc.nextInt();

       int arr[]= new int[n];

       for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
       }
       int j=n-1;
       for(int i=0;i<n/2;i++){
            int temp = arr[i]; 
            arr[i] = arr[j];    
            arr[j] = temp;
        if(j>n/2){
            j--;
        }
       }
       for(int a:arr){
        System.out.println(a);
       }
    }
}