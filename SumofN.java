import java.util.Scanner;
public class SumofN{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int n=sc.nextInt();
    int sum=0;
    int i;
    for(i=0;i<=n;i++){
sum=sum+i;
    }
    System.out.println("the sum of " +1 + " to " +n+ " number  is " + sum+ ".");
}
}