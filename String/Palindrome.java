package String;

public class Palindrome {
    public static void main(String[] args) {
        String s = "naman";
        int j = s.length() - 1;
        boolean ans = true;

        for(int i = 0; i < j; i++){
            if(s.charAt(i) != s.charAt(j)){
                ans = false;
                break;
            }
            j--; // move from end
        }

        System.out.println(ans);
    }
}