package DSAwithWASiM.DSAwithWasim.Array;
public class ContainerWithMostWater {
    public static int bigContainer(int[] height){
        int mostWater = 0;
        // left pointing to the left stick and right pointing right stick
        int left = 0,right = height.length-1;
        while(left<right){
            /* 
                here area = water means jitna bara area hoga utna hi jayada water store hoga container me
                Math.min(height[left],height[right]) -> ye Height ka kaam karega aur (right-left) ye width ka
                left aur right stick me jo chota hoga utna tak hi water aayega container me baaki sab flow ker jaayega
            */
            int area = Math.min(height[left],height[right]) *(right-left);
            mostWater = Math.max(mostWater, area);
            /*
                area badhane ke liye hum only width ko decrease ker sakte hai but width left se decrease kare ya right se ye depend kerta hai 
                left aur right me kon chota length ka stick hai jo chota hoga udher se decrease ker denge
                ager decrease kerne ke just baad usse bara stick milta hai to automatic new area old wale se bara hoga
            */
            if(height[left]<=height[right]){
                left++;
            }else{
                right--;
            }
        }
        return mostWater;
    }
    public static void main(String[] args) {
        int[] lengthOfStick = {7,4,7,10,8,3,10,4,12,9,5,8,3};
        System.out.println(bigContainer(lengthOfStick));
    }
}
