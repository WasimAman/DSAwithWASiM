package DSAwithWASiM.DSAwithWasim.Recursion;
import java.util.Scanner;

public class Fibonacci {
    public static int fib(int n){
        /*
        1,2,3,4,5,6,7, 8, 9,10
        | | | | | | |  |  | |
        0,1,1,2,3,5,8,13,21,34
        */
        // if you are counting Fibonacci sequence like this then this is valid code
        if(n==1){
            return 0;
        }else if(n==2){
            return 1;
        }
        /*
            0,1,2,3,4,5,6, 7, 8,9, 10
            | | | | | | |  |  | |  |
            0,1,1,2,3,5,8,13,21,34 55
        */
        // if you are counting Fibonacci sequence like this then this is valid code
        // if(n<2){
        //     return n;
        // }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number Whose Fibonacci sequence you want:- ");
        int n = sc.nextInt();
        System.out.println("Fibonacci of "+n+" is:- "+fib(n));
        sc.close();
    }
}
