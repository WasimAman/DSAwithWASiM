package DSAwithWASiM.DSAwithWasim.Array;
import java.util.Arrays;

public class RepeatAndMIssingNumber {
    public static int[] repeatAndMIssingNumber(int[] arr){
        for(int i=1;i<=arr.length;i++){
            while(arr[i-1]!=i && arr[i-1]!=arr[arr[i-1]-1]){
                int temp = arr[i-1];
                arr[i-1] = arr[temp-1];
                arr[temp-1] = temp; 
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==arr[i+1]){
                return new int[]{arr[i],arr[i]+1};
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2,5,3};
        System.out.println(Arrays.toString(repeatAndMIssingNumber(arr)));
    }
}
