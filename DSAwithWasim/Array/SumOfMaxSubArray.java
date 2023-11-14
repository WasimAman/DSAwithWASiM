/*
    https://leetcode.com/problems/maximum-subarray/description/
*/
package DSAwithWASiM.DSAwithWasim.Array;
public class SumOfMaxSubArray {
    public static int maxSubArray(int[] nums){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);        
        }
        return maxSum;
    }
    
    public static void main(String[] args) {
        int[] arr = {-2,-1};
        System.out.println(maxSubArray(arr));
    }
}
