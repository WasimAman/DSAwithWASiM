package DSAwithWASiM.DSAwithWasim.Array;
import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static int[] pruductOfArray(int[] arr){
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        left[0] = 1;
        for(int i=1;i<arr.length;i++){
            left[i] = left[i-1]*arr[i-1];
        }
        right[right.length-1]=1;
        for(int i=arr.length-2;i>=0;i--){
            right[i] = right[i+1]*arr[i+1];
        }
        int[] ans = new int[arr.length];
        for(int i=0;i<ans.length;i++){
            ans[i] = left[i]*right[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,3,9,2};
        System.out.println(Arrays.toString(pruductOfArray(arr)));
    }
}
