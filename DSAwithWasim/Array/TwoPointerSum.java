package DSAwithWASiM.DSAwithWasim.Array;
import java.util.Arrays;

public class TwoPointerSum {
    // Apply Binary search.
    public static boolean pairSumInRotatedSorted(int[] nums,int target){
        Arrays.sort(nums);
        int left = 0,right = nums.length-1;
        while(left<right){
            if(nums[left]+nums[right]==target){
                return true;
            }else if(nums[left]+nums[right]>target){
                right--;
            }else{
                left++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {11,15,6,8,9,10};
        System.out.println(pairSumInRotatedSorted(nums, 10));
    }
}
