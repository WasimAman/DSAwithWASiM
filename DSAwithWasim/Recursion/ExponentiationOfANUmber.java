package DSAwithWASiM.DSAwithWasim.Recursion;

public class ExponentiationOfANUmber {
    public static double getExpo(double base,int power){
        // Why am i returning 1 beacuse any thing power 0 is equal to 1.
        if(power==0){
            return 1;
        }
        return base*getExpo(base, power-1);
    }
    public static void main(String[] args) {
        System.out.println(getExpo(3.5, 4));
    }
}
