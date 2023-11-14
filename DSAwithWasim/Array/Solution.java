package DSAwithWASiM.DSAwithWasim.Array;
class Solution {
    public static int search(int[] nums, int target) {
        // [4,5,6,7,0,1,2]
        // 3,1
        int start = 0,end = nums.length-1;
        while (start<=end) {
            int mid = (start+end)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[start]<=nums[mid]){
                if(target>=nums[start] && target<nums[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(target>nums[mid] && target<=nums[end]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3,1};
        System.out.println(search(arr, 1));
    }
}
