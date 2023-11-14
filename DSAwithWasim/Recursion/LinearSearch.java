package DSAwithWASiM.DSAwithWasim.Recursion;

import java.util.ArrayList;

public class LinearSearch {
    // if target is persent in nums then return true otherwise false.
    public static boolean search1(int[] nums,int target,int index){
        // base condition
        if(index>nums.length-1){
            return false;
        }
        // if(nums[index]==target){
        //     return index;
        // }else{
        //     return search(nums, target, index+1);
        // }
        return nums[index]==target || search1(nums, target, index+1);
    }
    // if target is persent in nums then return index and break the calls other wise return -1.
    public static int search2(int[] nums,int target,int index){
        // base condition
        if(index>nums.length-1){
            return -1;
        }

        if(nums[index]==target){
            return index;
        }else{
            return search2(nums, target, index+1);
        }
    }
    // if target is persent in nums then return all indexex where target is persent.
    static ArrayList<Integer> list1 = new ArrayList<>();
    public static void search3(int[] nums,int target,int index){
        // base condition
        if(index>nums.length-1){
            return;
        }

        if(nums[index]==target){
            list1.add(index);
        }else{
            search3(nums, target, index+1);
        }
    }
    // search form last index till 0th index.
    public static int search4(int[] nums,int target,int index){
        // base condition
        if(index < 0){
            return -1;
        }
        if(nums[index]==target){
            return index;
        }else{
            return search4(nums, target, index-1);
        }
    }
    // returning arrayList
    public static ArrayList<Integer> search5(int[] nums,int target,int index,ArrayList<Integer>list){
        // base condition
        if(index>nums.length-1){
            return list;
        }
        if(nums[index]==target){
            list.add(index);
        }
        return search5(nums, target, index+1,list);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list2 = new ArrayList<>();
        int[] nums = {3,8,0,-1,6,9,-1};
        System.out.println(search5(nums, -1, 0,list2));
    }
}
