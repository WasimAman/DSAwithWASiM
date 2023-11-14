// /*
//     Three sum problem with the help of two pointer.
// */
//package wasim.Array;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.HashSet;
// import java.util.List;
// import java.util.Set;
//
// public class ThreeSum {
//     public static List<List<Integer>> 3Sum(int[] arr){
//         if(arr == null || arr.length<3){
//             return new ArrayList<>();
//         }
//         Set<List<Integer>> result = new HashSet<>();
//         for(int i=0;i<arr.length-2;i++){
//             int left = i+1,right = arr.length-1;
//             while(left<right){
//                 if(arr[left]+arr[right]==-arr[i]){
//                     result.add(Arrays.asList(arr[i],arr[left],arr[right]));
//                 }
//             }
//         }
//         return result;
//     }
//     public static void main(String[] args) {
//         Will come back letter.
//     }
// }
