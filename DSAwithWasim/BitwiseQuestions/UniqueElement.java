package DSAwithWASiM.DSAwithWasim.BitwiseQuestions;
class Solution{
    public int unique(int[] arr){
        int element = 0;
        for(int i=0;i<arr.length;i++){
            element = element^arr[i];
        }
        return element;
    }
}
public class UniqueElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,4,2,3,1};
        Solution s = new Solution();
        System.out.println("Unique Element is:- "+s.unique(arr));
    }
}
