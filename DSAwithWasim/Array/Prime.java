package DSAwithWASiM.DSAwithWasim.Array;
public class Prime {
    // It's not oprtimize solution.
    // Time complexity --> O(n) in worst case.
    public static boolean isPrimeWorst(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    // Optimize way to check whether a number is prime or not.
    // Time complexity --> O(sqrt(n)) in worst case.
    // this code is best suitable for single number not from 1 to N.
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;(i*i)<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        for(int i=1;i<=20;i++){
            // System.out.println(i+" "+isPrimeWorst(i));
            System.out.println(i+" "+isPrime(i));

        }
    }
    
}
