package DSAwithWASiM.DSAwithWasim.Recursion;
public class SumOfDigits {
    public static int sum(int n){
        if(n<10){
            return n;
        }
        return n%10+sum(n/10);
        // for product then return (n%10)*function(n/10)
        // function -> methode name whatever user will create
    }
    public static void main(String[] args) {
        System.out.println(sum(123));
    }
}
