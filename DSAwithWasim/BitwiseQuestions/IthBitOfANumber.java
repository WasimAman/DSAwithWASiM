package DSAwithWASiM.DSAwithWasim.BitwiseQuestions;
public class IthBitOfANumber {
    // 1st approch this will give the bit perent at nth possition
    public static int bit(int num,int n){
        num = num>>n-1;
        return num&1;
    }

    // 2nd approch this will give the number persent at nth bit
    public static int bit2(int num,int n){
        return num&(1<<n-1);
    }
    public static void main(String[] args) {
        int num = 54;
        int n = 5;
        System.out.println(bit(num, n));
        System.out.println(bit2(num, n));
    }
}
