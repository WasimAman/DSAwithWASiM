package DSAwithWASiM.DSAwithWasim.Array;
import java.util.Arrays;

public class TwoPointerNormal {
    public static void main(String[] args) {
        int[] arr = {-1,-8,-2,-5,0,8,7,1,2,6,4,7};
        System.out.println(Arrays.toString(twoSumNormal(arr)));

    }
    public static int[] twoSumNormal(int[] arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==0){
                    return new int[]{arr[i],arr[j]};
                }
            }
        }
        return new int[]{-1,-1};
    } 
}
