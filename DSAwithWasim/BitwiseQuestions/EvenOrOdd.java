package DSAwithWASiM.DSAwithWasim.BitwiseQuestions;

import java.util.Scanner;

// without using % operator.
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int num = sc.nextInt();
        if((num&1)==0){
            System.out.println(num+" Is an Even number!");
        }else{
            System.out.println(num+" Is an Odd number!");
        }
        sc.close();
    }
}
