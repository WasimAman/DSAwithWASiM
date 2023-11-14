package DSAwithWASiM.DSAwithWasim.Recursion;
import java.util.Scanner;

public class PalindromString {
    public static boolean isPalindrom(String str){
        // if Length of Stirng is 1 then return true
        if(str.length()==1){
            return true;
        }

        //  for palindrom ith index of charecter any string and String.lenght()-1-ith index of charecter must me same 
        char first = str.charAt(0);
        char last = str.charAt(str.length()-1);
        if(first!=last){
            return false;
        }

        // if above first == last then we have to ignore that indexex charecter to ignore we
        //  can remove that charecter or we can pass substring 
        String remainingString = str.substring(1, str.length()-1);
        return isPalindrom(remainingString);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String To check Palindrom:- ");
        String str = sc.next();
        System.out.println(str+":- "+isPalindrom(str));
        sc.close();
    }
}
