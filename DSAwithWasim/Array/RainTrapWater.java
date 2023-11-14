package DSAwithWASiM.DSAwithWasim.Array;
public class RainTrapWater {
    // Time Complexity --> N+N = 2N
    //                     Big Oh(2N) = Big Oh(N)

    // Space = Big Oh(N)
    public static int rainTrapWater(int[] height){
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int trapWater = 0;
        left[0] = height[0];
        right[right.length-1] = height[height.length-1];
        for(int i=1;i<left.length;i++){
            left[i] = Math.max(left[i-1],height[i]);
            right[right.length-i-1] = Math.max(right[right.length-i], height[height.length-i-1]);
        }
        for(int i=0;i<height.length;i++){
            trapWater+=(Math.min(left[i], right[i])-height[i]);
        }
        return trapWater;
    }
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(rainTrapWater(height) );
    }
}
