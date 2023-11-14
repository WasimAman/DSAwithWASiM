package DSAwithWASiM.DSAwithWasim.Recursion;
import java.util.Scanner;

public class Factorial {
    public static long fact(int n){
        if(n==2){
            return 2;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Don't Enter Large number.
        System.out.print("Enter number Whose Factorial do you want to find:- ");
        int n = sc.nextInt();
        System.out.println("Factorial of "+n+" is:- "+fact(n));
        sc.close();
    }
}
