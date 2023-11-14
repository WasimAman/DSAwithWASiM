package DSAwithWASiM.DSAwithWasim.BitwiseQuestions;
public class SetIthBit {
    // Dry run on bit and try to convert result bit into decimal
    /*
        0-->1 
        1-->1
    */
    public static int setBit(int num,int n){
        return num|(1<<n-1);
    }
    public static void main(String[] args) {
        int num = 32;
        int n = 4;
        System.out.println(setBit(num, n));
    }
}
