package String;
import java.util.*;
public class LongestUniqueSubstring {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int maxLength=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String a=s.substring(i,j+1);
                if(isUnique(a)){
                    int n=a.length();
                    if(n>maxLength){
                        maxLength=n;
                    }
                }
            }
        }
        System.out.print(maxLength);
    }
    public static boolean isUnique(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    return false;
                }
            }
        }return true;
    }


}
