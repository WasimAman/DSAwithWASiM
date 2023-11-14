package DSAwithWASiM.DSAwithWasim.Recursion;
public class TrickyProblem1 {
    public static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        // fun(n--); --> this will throw stackOverflow error due to post decreament
        //  in post decreament first operation will perform after that decreament will happen
        // so basically fun(n--) will become fun(n) --> infinite recursion call base condition will never reach.

        fun(--n);   // this will not throw any error because it is pre decreament 
    }
    public static void main(String[] args) {
        fun(5);
    }
}
