/*
    https://leetcode.com/problems/contains-duplicate/description/
*/
package DSAwithWASiM.DSAwithWasim.Array;

import java.util.Arrays;

public class ContainDublicate {
    public static boolean check(int[] nums){
        boolean yes = false;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                yes = true;
                break;
            }
        }
        return yes;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(check(arr));
    }
}
