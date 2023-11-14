package DSAwithWASiM.DSAwithWasim.BitwiseQuestions;
public class SetIthBitAnd {
    /*
        0-->0
        1-->0 
    */
    public static int setBit(int num,int n){
        return num&(~(1<<n-1));
    }
    public static void main(String[] args) {
        int num = 54;
        int n = 4;
        System.out.println(setBit(num, n));
    }
}

