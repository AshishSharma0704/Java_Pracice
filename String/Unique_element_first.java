package String;
public class Unique_element_first {
        public static void main(String[] args) {
            String s="loveleetcode";
             int freq[]= new int[26];
             int ans=-1;

        for(int i=0; i<s.length();i++){
            freq[s.charAt(i)-'a']++;

        }
        
        for(int j=0;j<s.length();j++){
            if(freq[s.charAt(j)-'a']==1){
                ans =j;
                break;
            }
        }
        System.out.println(ans);
        for(int a:freq){
            System.out.print(a+" ");
        }
        }      
}