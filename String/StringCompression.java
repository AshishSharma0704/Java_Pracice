package String;
public class StringCompression {
    public static void main(String[] args) {
        String s="aaaabbcdddaa";
        int n=s.length();
        int count=1;
        for(int i=0;i<n-1;i++){
            
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }else{
                System.out.print(s.charAt(i)+""+count);
                count=1;
            }
        }System.out.print(s.charAt(n - 1) + "" + count);
    }   
}
