public class PrimeNO{
    public static void main(String[] args){
        int no = 18;
        boolean isPrime = true;  

        if(no <= 1) {
            isPrime = false; 
        } else {
            for(int i = 2; i <= Math.sqrt(no); i++){ 
                if(no % i == 0){
                    isPrime = false; 
                    break;
                }
            }
        }

        if(isPrime){
            System.out.println("The given number is a prime number");
        } else {
            System.out.println("The given number is not a prime number");
        }
    }
}
