package String;
public class Substring {
    public static void main(String[] args) {
        String word = "Ashish";
        int n = word.length();

        for(int i=1;i<=n;i++){
            for(int j=i; j<=n;j++){
                int k=j-i;
                System.out.print(word.substring(k,j)+"\t");
            }System.out.println();
        }
        
    }
}
