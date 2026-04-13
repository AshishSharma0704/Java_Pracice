import java.util.*;

public class Stack_TOC {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your String: ");
        int n=sc.nextInt();
        for(int i=0; i<n;i++){
            s.push("a");
        }
        
        for(int i=0; i<n;i++){
            s.push("b");
        }

        System.out.println(s);        
        System.out.println(s.pop());  
        System.out.println(s.peek()); 
    }
}