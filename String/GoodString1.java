package String;
import java.util.*;

public class GoodString1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int maxLen = 0;

        for(int i = 0; i < s.length(); i++){
    for(int j = i; j < s.length(); j++){
        String c = s.substring(i, j + 1);

        if(isTrue(c)){
            if(c.length() > maxLen){   
                maxLen = c.length();
                }
            }
        }
    }
        System.out.println(maxLen);
    }

    public static boolean isTrue(String s){
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u'){
                return false;
            }
        }
        return true;
    }
}