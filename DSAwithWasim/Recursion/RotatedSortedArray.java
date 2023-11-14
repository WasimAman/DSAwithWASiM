package DSAwithWASiM.DSAwithWasim.Recursion;

public class RotatedSortedArray {
    public static int searchInRotatedArray(int[] nums,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int middle = (start+end)/2;
        if(nums[middle]==target){
            return middle;
        }else if(nums[middle]>nums[start]){
            if(target>=nums[start] && target<nums[middle]){
                return searchInRotatedArray(nums, target, start, middle-1);
            }else{
                return searchInRotatedArray(nums, target, middle+1, end);
            }
        }else{
            if(target>nums[middle] && target<=nums[end]){
                return searchInRotatedArray(nums, target, middle+1, end);
            }else{
                return searchInRotatedArray(nums, target, start, middle-1);
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {6,7,8,1,2,3,4,5};
        System.out.println(searchInRotatedArray(nums, 6, 0, nums.length-1));
    }
}
