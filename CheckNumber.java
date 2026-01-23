import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num>0){
            System.out.println("the number is positive number");
        }
        else{
            SYstem.out.println("the number is neagtive number");
        }
    }
}