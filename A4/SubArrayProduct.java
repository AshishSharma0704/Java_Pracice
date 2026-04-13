import java.util.*;
public class SubArrayProduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 
        int k=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        
int count=0;
for(int i = 0; i < n; i++) {
    for(int j = i; j < n; j++) {

        int product=nums[i];int ans=1;
        for(int p = i; p <= j; p++) {
            if(nums[p]==nums[i]){
                ans=nums[p];
            }else{
                ans=product*=nums[p];
            }
        }
        if(ans<k){
            count++;
        }
    }
}System.out.print(count);
    }
}
