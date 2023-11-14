/*
    https://www.geeksforgeeks.org/chocolate-distribution-problem/
*/
package DSAwithWASiM.DSAwithWasim.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ChocolateDistribution {
    public static int minChocolate(int[] arr,int n){
        if(n<0){
            return -1;
        }else if(n>arr.length){
            return -2;
        }
        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i=0;(n+i-1)<arr.length;i++){
            min = Math.min(min, arr[n-1+i]-arr[i]);
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {12};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of students:- ");
        int n = sc.nextInt();
        int result = minChocolate(arr, n);
        if(result==-1){
            System.out.println("Invalid Students No!");
        }else if(result==-2){
            System.out.println("Sorry students are more than chocolates!");
        }else{
            System.out.println(result);
        }
        sc.close();
    }
}
