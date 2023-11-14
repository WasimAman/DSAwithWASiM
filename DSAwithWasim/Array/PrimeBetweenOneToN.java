package DSAwithWASiM.DSAwithWasim.Array;
public class PrimeBetweenOneToN {
    public static void main(String[] args) {
        isPrimeBetween1ToN(1, 50);
    }

    public static void isPrimeBetween1ToN(int start ,int end){
        boolean[] arr = new boolean[end+1];
        for(int i=2;(i*i)<=end;i++){
            if(!arr[i]){
                for(int j=i*2;j<=end;j+=i){
                    arr[j] = true;
                }
            }
        }

        for(int i=2;i<=end;i++){
            if(!arr[i]){
                System.out.println(i);
            }
        }
    }
}
