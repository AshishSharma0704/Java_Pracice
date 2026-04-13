package String;
import java.util.*;
public class CanYouReadMe {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        for(int i=0;i<s.length()-1;i++){
            if(Character.isUpperCase(s.charAt(i+1))){
                System.out.println(s.charAt(i));
            }else{
                System.out.print(s.charAt(i));
            }
        }System.out.print(s.charAt(s.length()-1));
    }
}