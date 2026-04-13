package String;
import java.util.*;
public class GoodString2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int maxLength=0;
        int currentLength=0;
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                currentLength++;
                if(currentLength>maxLength){
                    maxLength=currentLength;
                }

            }else{
                currentLength=0;
            }
        }System.out.println(maxLength);
    }
     public static boolean isVowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
}
