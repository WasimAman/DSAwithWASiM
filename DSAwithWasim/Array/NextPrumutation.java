package DSAwithWASiM.DSAwithWasim.Array;
import java.util.Arrays;
// try to improve space complexity
public class NextPrumutation {
    public static void reverse(int[] arr,int begin,int end){
        for(int i=begin;i<=end/2;i++){
            int temp = arr[i];
            arr[i] = arr[end-i];
            arr[end-i] = temp;
        }
    }
    public static void assendingSort(int[] arr,int start,int end){
        //  int[] arr = {2,1,5,4,3,0,0};
        for(int i=start+1;i<=end;i++){
            int current = arr[i];
            int j = i-1;
            while(j>=start && current<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        // System.out.println(Arrays.toString(arr));
    }
    public static int[] prumutation(int[] arr){
        int index = -1;
        // Finding Break point.
        //  int[] arr = {2,1,5,4,3,0,0};
        for(int i=arr.length-1;i>0;i--){
            if(arr[i-1]<arr[i]){
                index = i-1;
                // System.out.println(index);
                break;
            }
        }
        // sort the array after index
        if(index == -1){
            reverse(arr, 0, arr.length-1);
            return arr;
        }else{
            assendingSort(arr,index+1,arr.length-1);
        }
        // swap index and bigger than index
        // [2, 1, 0, 0, 3, 4, 5]
        for(int i=index;i<arr.length;i++){
            if(arr[index]<arr[i+1]){
                int temp = arr[index];
                arr[index] = arr[i+1];
                arr[i+1] = temp;
                // System.out.println(i+" "+(i+1));
                break;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(prumutation(arr)));
    }
}