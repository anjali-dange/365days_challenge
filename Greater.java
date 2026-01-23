import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the three numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("The " + n1 + " is the greatest number");
        } 
        else if (n2 > n1 && n2 > n3) {
            System.out.println("The " + n2 + " is the greatest number");
        } 
        else if(n1==n2&&n2==n3){
            System.out.println("all are the same numbers");
        }
        else {
            System.out.println("The " + n3 + " is the greatest number");
        }
    }
}
