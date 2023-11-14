package DSAwithWASiM.DSAwithWasim.Array;
public class MaximumProductSubArray {
    public static int maxProductSubArray(int[] nums){
        int leftMax = 1;
        int rightMax = 1;
        int maxProduct = 1;
        for(int i=0;i<nums.length;i++){
            leftMax *= nums[i];
            rightMax *= nums[nums.length-1-i];
            if(leftMax==0){
                leftMax = 1;
            }
            if(rightMax==0){
                rightMax = 1;
            } 
            maxProduct = Math.max(maxProduct,Math.max(leftMax,rightMax));
        }
        return maxProduct;
    }
    public static void main(String[] args) {
        int[] nums1 = {2,3,-2,4,4};
        int[] nums2 = {-2,0,-1};
        int[] nums3 = {2,3,-1,0,3,7,8,2,0,-9};
        System.out.println(maxProductSubArray(nums1));        
        System.out.println(maxProductSubArray(nums2));
        System.out.println(maxProductSubArray(nums3));

    }
}
