package DSAwithWASiM.DSAwithWasim.Array;
import java.util.Arrays;

class TwoPointers{
    public boolean twoPointer(int[] arr){
        int i=0,j=arr.length-1;
        Arrays.sort(arr);
        while(i<j){
            if(arr[i]+arr[j]==0){
                return true;
            }else if(arr[i]+arr[j]>0){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
}
public class TwoPointersDemo {
    public static void main(String[] args) {
        int[] arr = {1,-8,2,-5,0,-8,7,1,2,6,4,7};
        TwoPointers t = new TwoPointers();
        System.out.println(t.twoPointer(arr));
    }
}
