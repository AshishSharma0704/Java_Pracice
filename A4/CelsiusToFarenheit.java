import java.util.*;

public class CelsiusToFarenheit {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner (System.in)){
        int min = sc.nextInt();
        int max = sc.nextInt();
        int step = sc.nextInt();

        for(int i=min; i<=max;i+=step){
            
            int c = (i-32)*5/9;
            System.out.println(i+ "\t"+c);
            
            
        }}
        
    }
}
