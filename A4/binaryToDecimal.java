import java.util.*;

public class binaryToDecimal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        int result[] = new int[t];  

        for(int k = 0; k < t; k++){

            String s = sc.nextLine();
            int n = s.length();

            int arr[] = new int[n];

            for(int i = 0; i < n; i++){
                arr[i] = s.charAt(i) - '0';
            }

            int power[] = new int[n];
            int val = 1;

            for(int i = n-1; i >= 0; i--){
                power[i] = val;
                val *= 2;
            }

            int sum = 0;
            for(int i = 0; i < n; i++){
                sum += arr[i] * power[i];
            }

            result[k] = sum;   
        }

        for(int num : result){
            System.out.println(num + " ");
        }
    }
}