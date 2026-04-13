import java.util.Scanner;

public class TranspositionCipher{
    //encryption code
    public static String encrypt(String text, int key){
        int rows = (int) Math.ceil((double) text.length() / key); 
        char[][] matrix = new char[rows][key]; // new int[rows][column]
        
        int index = 0;
        for(int i = 0;i<rows;i++){
            for(int j = 0; j<key;j++){
                if(index < text.length()){
                    matrix[i][j] = text.charAt(index++);
                }else{
                    matrix[i][j] = 'X'; //empty padding
                }
            }
        }
        
        StringBuilder cipher = new StringBuilder();
        for(int j = 0; j<key;j++){
            for(int i = 0;i<rows;i++){
                cipher.append(matrix[i][j]);
            }
        }
        return cipher.toString();
    }
    
    //decryption
    public static String decrypt(String cipher, int key){
        int rows = (int) Math.ceil((double) cipher.length() / key);
        char[][] matrix = new char[rows][key];
        
        int index =0;
        for(int j = 0;j<key;j++){
            for(int i =0;i<rows;i++){
                matrix[i][j] = cipher.charAt(index++);
            }
        }
        
        StringBuilder text = new StringBuilder();
        for(int i =0; i<rows;i++){
            for(int j =0;j<key;j++){
                text.append(matrix[i][j]);
            }
        }
        return text.toString();
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = sc.nextLine();
        
        System.out.print("Enter key(Number of column)");
        int key = sc.nextInt();
        
        String encrypted = encrypt(text, key);
        String decrypted = decrypt(encrypted, key);
        
        System.out.println("Encrypted text: " + encrypted);
        System.out.println("Decrypted Text: " + decrypted);
    }
    
}