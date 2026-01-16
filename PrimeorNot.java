public class PrimeorNot {
    public static void main(String[] args) {
        int n = 49;
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(" prime number");
        } else {
            System.out.println("is not a prime number");
        }
    }
}

