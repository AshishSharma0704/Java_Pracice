import java.util.*;
public class inverseArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
        }
        
        int inv[] = new int[n];

        for(int i =0; i<n; i++){
          int value=arr[i];
          inv[value]=i;
        }
        for(int num:inv){
            System.out.print(num);
        }
    }
}