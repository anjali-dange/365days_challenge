import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        // Error Fix: Assign the input to the variable 'n'
        int n = sc.nextInt(); 

        // Error Fix: Corrected 'SYstem' and 'pritnln'
        if (n % 2 == 0) {
            System.out.println("The given "+n +" is an Even number");
        } else {
            System.out.println("The given " + n + "  is an Odd number");
        }
        
        sc.close();
    }
}