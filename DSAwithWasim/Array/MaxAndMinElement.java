/*
    https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
    link fo questioin.
*/
package DSAwithWASiM.DSAwithWasim.Array;
import java.util.Arrays;

class Pair{
    public int max;
    public int min;
}
public class MaxAndMinElement {
    // method of type Pair 
    public static Pair getMinAndMax(int[] arr,int n){
        Pair minMax = new Pair();
        Arrays.sort(arr);
        minMax.max = arr[n-1];
        minMax.min = arr[0];
        return minMax;  // returning Pair type object
    }

    public static void main(String[] args) {
        int arr[] = { 1000, 11, 445, 1, 330, 3000 };
        // storing Pair type object in pair type refrence variable
        Pair minMax = getMinAndMax(arr, arr.length);
        System.out.println(minMax.max);
        System.out.println(minMax.min);
    }
}