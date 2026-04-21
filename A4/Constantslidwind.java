public class Constantslidwind {
     public static void main(String[] args) {
        int arr[] = {2, 4, 5, 9, 6, 4};
        int k =3;
        int sum =0;
        int ans =0;
        for(int i=0; i<k; i++){
            ans +=arr[i];
        }
        sum = ans;
        for(int j =k; j<arr.length; j++){
            ans+= arr[j];
            ans-= arr[j-k];
            sum= Math.max(ans, sum);
        }
        System.out.print(sum);
     }
}