import java.util.Scanner;

class SubstitutionCipher {

    
    public static String encrypt(String text, int key) {
        StringBuilder result = new StringBuilder();

        for (char ch : text.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                char encrypted = (char) ((ch - 'A' + key) % 26 + 'A');
                result.append(encrypted);
            } else if (Character.isLowerCase(ch)) { 
                char encrypted = (char) ((ch - 'a' + key) % 26 + 'a');
                result.append(encrypted);
            } else {
                result.append(ch); // yeh space for symbol
            }
        }
        return result.toString();
    }
    // Decrypt wala function
    public static String decrypt(String text, int key) {
        return encrypt(text, 26 - key);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.print("Enter key: ");
        int key = sc.nextInt();

        String encrypted = encrypt(text, key);
        String decrypted = decrypt(encrypted, key);

        System.out.println("Encrypted Text: " + encrypted);
        System.out.println("Decrypted Text: " + decrypted);
    }
}
