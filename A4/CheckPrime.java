

public class CheckPrime {
    public static void main(String[] args) {
        
        int N = 7;

        if (N <= 1) {
            System.out.print("Not Prime");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.print("Prime");
        } else {
            System.out.print("Not Prime");
        }
    }
}
