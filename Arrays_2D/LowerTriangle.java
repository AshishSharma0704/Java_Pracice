package Arrays_2D;
import java.util.*;
public class LowerTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(arr[i][j]==0){
                    ans=1;
                    break;
                }
            }
        }
        if(ans==0){
            System.out.println("false");
        }else{
            System.out.println("true");
        }
    }
}
