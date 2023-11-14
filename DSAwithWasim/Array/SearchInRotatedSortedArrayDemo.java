package DSAwithWASiM.DSAwithWasim.Array;
import java.util.Scanner;

class Search{
    public int serachInarray(int[] arr,int target){
        // 5,6,1,2,3,4  this is given array.
        int start = 0,end = arr.length-1;
        while(start<=end){
            int middle = (start+end)/2;
            if(arr[middle]==target){
                return middle;
            }else if(arr[middle]>arr[start]){
                if(target>=arr[start] && target<arr[middle]){
                    end = middle-1;
                }else{
                    start = middle+1;
                }
            }else{
                if(target>arr[middle] && target<=arr[end]){
                    start = middle+1;
                }else{
                    end = middle-1;
                }
            }
        }
        return -1;
    }
}
public class SearchInRotatedSortedArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5,6,1,2,3,4};
        System.out.print("Enter target Element:- ");
        int target = sc.nextInt();
        Search s = new Search();
        int index = s.serachInarray(arr, target);
        if(index<0){
            System.out.println("Target Element is not found!");
        }else{
            System.out.println("Target Element is found at index No."+index);
        }
        sc.close();
    }
}
