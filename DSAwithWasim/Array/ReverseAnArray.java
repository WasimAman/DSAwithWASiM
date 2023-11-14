/*
    https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/
*/
package DSAwithWASiM.DSAwithWasim.Array;
import java.util.Arrays;

public class ReverseAnArray {
    // using recursion.
    public static void reverseArray1(int[] arr,int start,int end){
        if(start>=end){
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray1(arr, start+1, end-1);
    }

    // using itration.
    public static void reverseArray2(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,7,12,54,90,-1,23};
        // Using recursion.
        reverseArray1(arr,0,arr.length-1);
        System.out.println("Oroginal array is:- "+Arrays.toString(arr));
        System.out.println("Reversed array is:- "+Arrays.toString(arr));

        // Using Itration.
        System.out.println("Oroginal array is:- "+Arrays.toString(arr));
        reverseArray2(arr,0,arr.length-1);
        System.out.println("Reversed array is:- "+Arrays.toString(arr));
    }
    
}
