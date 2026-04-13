package String;
import java.util.*;
public class BiggestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int a=0;a<t;t++){
            int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        String[] str=new String[n];

        for(int i=0;i<n;i++){
            String s = Integer.toString(arr[i]);
            str[i]=s;
        }
        
        for(int j=0; j<n;j++){
            for(int i=j+1;i<n;i++){
            if((str[i]+str[j]).compareTo(str[j]+str[i])>0){
                String temp=str[i];
                str[i]=str[j];
                str[j]=temp;
            }
        }
        }


        for(String b:str){
            System.out.print(b);
        }
        }
    }
}
