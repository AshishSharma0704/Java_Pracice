package String;
import java.util.*;
public class MaxFreq {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        
            String s = sc.nextLine();
            

            int []freq = new int[26];
                //count
           for(int k =0; k<s.length(); k++){
                freq[s.charAt(k) - 'a']++;
           }
           //repeating
           int max=0;
           char result=' ';
           for(int j =0; j<s.length(); j++){
                if(freq[s.charAt(j)-'a'] >max){
                    max=freq[s.charAt(j)-'a'];
                    result=s.charAt(j);
                    
                }
           }
          
         System.out.println(result);
    }
}